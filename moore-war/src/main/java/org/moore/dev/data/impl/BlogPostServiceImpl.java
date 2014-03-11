package org.moore.dev.data.impl;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import org.moore.dev.data.BlogPostService;
import org.moore.dev.model.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/9/14
 */
@Service
public class BlogPostServiceImpl implements BlogPostService {

    @Override
    public List<BlogPost> getBlogPosts() {

        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Key blogKey = KeyFactory.createKey("Blog", "MainBlog");
        Query query = new Query("BlogPost", blogKey).addSort("date", Query.SortDirection.DESCENDING);
        List<Entity> blogPostEntities = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(25));

        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        for (Entity blogPostEntity : blogPostEntities) {
            BlogPost blogPost = new BlogPost();
            blogPost.setAuthor((String) blogPostEntity.getProperty("user"));
            blogPost.setDate((Date) blogPostEntity.getProperty("date"));
            blogPost.setText((String) blogPostEntity.getProperty("content"));
            blogPost.setTitle((String) blogPostEntity.getProperty("title"));
            blogPosts.add(blogPost);
        }

        return blogPosts;
    }

    @Override
    public Boolean createBlogPost(BlogPost post) {

        Boolean postSaved = false;
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();

        Key blogKey = KeyFactory.createKey("Blog", "MainBlog");
        Entity blogEntity = new Entity("BlogPost", blogKey);
        blogEntity.setProperty("user", post.getAuthor());
        blogEntity.setProperty("date", post.getDate());
        blogEntity.setProperty("title", post.getTitle());
        blogEntity.setProperty("content", post.getText());

        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        try {
            datastore.put(blogEntity);
            postSaved = true;
        } catch (Exception e) {
            //Do something
        }

        return postSaved;
    }
}
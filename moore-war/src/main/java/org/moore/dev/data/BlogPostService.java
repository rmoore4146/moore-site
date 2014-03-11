package org.moore.dev.data;

import org.moore.dev.model.BlogPost;

import java.util.List;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/9/14
 */
public interface BlogPostService {

    List<BlogPost> getBlogPosts();

    Boolean createBlogPost(BlogPost post);
}

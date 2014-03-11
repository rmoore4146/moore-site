package org.moore.dev.web.controller;

import org.moore.dev.data.BlogPostService;
import org.moore.dev.model.BlogPost;
import org.moore.dev.web.controller.util.MobileDeviceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/9/14
 */
@Controller
public class BlogController {

    @Autowired
    private BlogPostService blogPostService;

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String getBlogPage(ModelMap map, HttpServletRequest request) {

        MobileDeviceUtil.addMobileDeviceFlagToModel(map, request);
        map.addAttribute("blogPosts", blogPostService.getBlogPosts());
        return "blog";
    }

    @RequestMapping(value = "/newPost", method = RequestMethod.GET)
    public String newBlogPage(ModelMap map, HttpServletRequest request) {

        MobileDeviceUtil.addMobileDeviceFlagToModel(map, request);
        return "newPost";
    }

    @RequestMapping(value = "/createPost", method = RequestMethod.POST)
    public String postNewBlog(ModelMap map, HttpServletRequest request) {

        String title = request.getParameter("title");
        String text = request.getParameter("text");

        String resultUrl;
        try {
            BlogPost post = new BlogPost(title, text);
            blogPostService.createBlogPost(post);
            resultUrl = "tile/successMessage";
        } catch (Exception e) {
            resultUrl = "tile/errorMessage";
        }

        return resultUrl;
    }
}

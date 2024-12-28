package com.manav.bloggersplace.controllers;

import com.manav.bloggersplace.models.Blog;
import com.manav.bloggersplace.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable Integer blogId) {
        return blogService.getBlog(blogId);
    }

    @PostMapping("/add")
    public String addBlog(@RequestBody Blog blog) {
        return blogService.addBlog(blog);
    }

    @PutMapping("/add")
    public Blog updateBlog(@RequestBody Blog updatedBlog) {
        return blogService.updateBlog(updatedBlog);
    }

}

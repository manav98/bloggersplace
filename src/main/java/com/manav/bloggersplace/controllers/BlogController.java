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

    @GetMapping
    public String healthCheck() {
        return "The API is up and running";
    }

    @GetMapping("/{id}")
    public Blog getBlog(@PathVariable Integer id) {
        return blogService.getBlog(id);
    }

    @PostMapping("/add")
    public String addBlog(@RequestBody Blog blog) {
        return blogService.addBlog(blog);
    }

}

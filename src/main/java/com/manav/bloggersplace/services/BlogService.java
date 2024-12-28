package com.manav.bloggersplace.services;

import com.manav.bloggersplace.models.Blog;
import com.manav.bloggersplace.repositories.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    BlogRepo blogRepo;

    public String addBlog(Blog blog) {
        blogRepo.save(blog);
        return "Blog has been saved successfully";
    }

    public Blog getBlog(Integer id) {
        return blogRepo.findById(id).get();
    }
}

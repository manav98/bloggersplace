package com.manav.bloggersplace.repositories;

import com.manav.bloggersplace.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends JpaRepository<Blog,Integer> {
}

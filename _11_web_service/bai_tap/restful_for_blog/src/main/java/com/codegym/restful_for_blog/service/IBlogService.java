package com.codegym.restful_for_blog.service;

import com.codegym.restful_for_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAllBlog();

    Optional<Blog> findById(int id);

    List<Blog> findByNameCategory(String nameCategory);
}

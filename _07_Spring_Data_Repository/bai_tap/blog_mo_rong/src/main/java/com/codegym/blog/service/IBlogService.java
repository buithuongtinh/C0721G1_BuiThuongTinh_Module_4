package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    Blog findByid(int id);
    void delete(Blog blog);
    void update(Blog blog);


}

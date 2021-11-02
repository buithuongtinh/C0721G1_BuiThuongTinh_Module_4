package com.codegym.blog.service;

import com.codegym.blog.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog>findAll();
    void save(Blog blog);
    Blog findByid(int id);
    void delete(int id);
    void update(Blog blog);
}

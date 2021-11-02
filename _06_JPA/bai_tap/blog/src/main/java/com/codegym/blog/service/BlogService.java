package com.codegym.blog.service;


import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public Blog findByid(int id) {
        return this.blogRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        this.blogRepository.deleteById(id);
    }

    @Override
    public void update(Blog blog) {
        this.blogRepository.save(blog);
    }
}

package com.codegym.service.impl;


import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService {
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
    public Optional<Blog> findById(long id) {
        return this.blogRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        this.blogRepository.deleteById(id);
    }

    @Override
    public Blog edit(Blog blog) {
        return this.blogRepository.save(blog);
    }
}
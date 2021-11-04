package com.codegym.blog.service;


import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;


@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog findByid(int id) {
        return this.iBlogRepository.findById(id).get();
    }

    @Override
    public void delete(Blog blog) {
        this.iBlogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.save(blog);
    }
}

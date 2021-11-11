package com.codegym.restful_for_blog.service;

import com.codegym.restful_for_blog.model.Blog;
import com.codegym.restful_for_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BlogServiceImpl implements IBlogService{

    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(int id) {
        return blogRepository.findById( id);
    }

    @Override
    public List<Blog> findByNameCategory(String nameCategory) {
        return this.blogRepository.findAllByCategory_NameCategory(nameCategory);
    }
}

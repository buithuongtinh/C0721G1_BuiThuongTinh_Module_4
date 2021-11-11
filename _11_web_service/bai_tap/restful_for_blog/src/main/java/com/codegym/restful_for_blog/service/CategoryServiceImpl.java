package com.codegym.restful_for_blog.service;

import com.codegym.restful_for_blog.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryService categoryService;

    @Override
    public List<Category> findAll() {
        return this.categoryService.findAll();
    }
}

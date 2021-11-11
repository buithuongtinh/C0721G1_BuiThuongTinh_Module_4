package com.codegym.restful_for_blog.service;

import com.codegym.restful_for_blog.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();
}

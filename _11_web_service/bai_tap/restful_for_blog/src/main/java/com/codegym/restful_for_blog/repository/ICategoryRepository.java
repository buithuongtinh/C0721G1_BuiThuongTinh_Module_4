package com.codegym.restful_for_blog.repository;

import com.codegym.restful_for_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}

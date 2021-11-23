package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findAllByCategory_NameCategory(String nameCategory);
}

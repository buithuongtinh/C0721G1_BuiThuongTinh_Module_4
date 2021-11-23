package com.codegym.model.repository;

import com.codegym.model.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}

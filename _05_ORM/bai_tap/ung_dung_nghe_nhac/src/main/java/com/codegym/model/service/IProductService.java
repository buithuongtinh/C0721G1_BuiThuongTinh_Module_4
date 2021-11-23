package com.codegym.model.service;

import com.codegym.model.bean.Product;

import java.util.List;

public interface IProductService {

    List<Product> selectAll();

    void save(Product product);

    Product findById(int id);

    void remove(Product product);

    Product findByName(String name);

    List<Product> findByNameProductContainingOrPriceBetween(String name, String price1, String price2);
}

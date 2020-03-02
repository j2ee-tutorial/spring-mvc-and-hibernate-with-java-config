package com.javastudio.tutorial.dao;

import com.javastudio.tutorial.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> list();

    void add(Product product);
}

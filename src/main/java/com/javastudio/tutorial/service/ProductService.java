package com.javastudio.tutorial.service;

import com.javastudio.tutorial.model.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);

    List<Product> list();
}

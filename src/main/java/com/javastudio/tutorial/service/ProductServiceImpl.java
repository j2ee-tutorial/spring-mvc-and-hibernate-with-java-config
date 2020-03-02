package com.javastudio.tutorial.service;

import com.javastudio.tutorial.dao.ProductDao;
import com.javastudio.tutorial.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> list() {
        return dao.list();
    }

    @Override
    @Transactional
    public void add(Product product) {
        dao.add(product);
    }
}

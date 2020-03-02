package com.javastudio.tutorial.dao;

import com.javastudio.tutorial.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class ProductDaoImpl implements ProductDao {
    Logger logger = Logger.getLogger(ProductDaoImpl.class.getName());

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product> list() {
        logger.info("Getting list of products from dao");
        @SuppressWarnings("unchecked")
        TypedQuery<Product> query = sessionFactory.getCurrentSession().createQuery("from Product");
        return query.getResultList();
    }

    @Override
    public void add(Product product) {
        logger.info("Saving a product in dao layer");
        sessionFactory.getCurrentSession().save(product);
    }
}

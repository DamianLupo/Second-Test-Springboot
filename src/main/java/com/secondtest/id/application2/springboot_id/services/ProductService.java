package com.secondtest.id.application2.springboot_id.services;

import java.util.List;

import com.secondtest.id.application2.springboot_id.models.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(long idProduct);
}

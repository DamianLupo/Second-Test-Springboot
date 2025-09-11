package com.secondtest.id.application2.springboot_id.repositories;

import java.util.List;

import com.secondtest.id.application2.springboot_id.models.Product;

public interface ProductRepositorie {
    List<Product> findAll();
    Product findById(long idProduct);
}

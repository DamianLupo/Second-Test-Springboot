package com.secondtest.id.application2.springboot_id.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.secondtest.id.application2.springboot_id.models.Product;
import com.secondtest.id.application2.springboot_id.services.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class Product_Controller {
    
    @Autowired
    private ProductService service;
    @GetMapping()
    public List<Product> listProducts(){
        return service.findAll();
    }
    @GetMapping("/{idProduct}")
    public Product showProduct(@PathVariable long idProduct) {
        
        return service.findById(idProduct);
        
    }
    

}

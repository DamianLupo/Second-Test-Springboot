package com.secondtest.id.application2.springboot_id.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.secondtest.id.application2.springboot_id.models.Product;
import com.secondtest.id.application2.springboot_id.services.Products_Services_Imp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class Product_Controller {
    
    private Products_Services_Imp service = new Products_Services_Imp();
    @GetMapping()
    public List<Product> listProducts(){
        return service.findAll();
    }
    @GetMapping("/{idProduct}")
    public Product showProduct(@PathVariable long idProduct) {
        
        return service.findById(idProduct);
        
    }
    

}

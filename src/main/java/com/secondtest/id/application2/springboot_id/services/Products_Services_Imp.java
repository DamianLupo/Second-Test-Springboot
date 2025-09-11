package com.secondtest.id.application2.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;

import com.secondtest.id.application2.springboot_id.models.Product;
import com.secondtest.id.application2.springboot_id.repositories.ProductRepositorie;
import com.secondtest.id.application2.springboot_id.repositories.Repo_Products_imp;

public class Products_Services_Imp implements ProductService {

    private Repo_Products_imp repositorie = new Repo_Products_imp();

    @Override
    public List<Product> findAll(){
        return repositorie.findAll().stream().map(p->{
            Double totalPrice = p.getPrice()*1.50;

            Product products = (Product) p.clone();
            products.setPrice(totalPrice.intValue());
            return products;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(long idProduct){
        return repositorie.findById(idProduct);
    }
    
    

    
}

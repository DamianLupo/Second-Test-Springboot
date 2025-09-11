package com.secondtest.id.application2.springboot_id.repositories;

import java.util.Arrays;
import java.util.List;

import com.secondtest.id.application2.springboot_id.models.Product;

public class Repo_Products_imp implements ProductRepositorie {
    List <Product> data;
    public Repo_Products_imp(){
        this.data=Arrays.asList(
            new Product(001L, "Disco Solido NMVE 2TB", 213000),
            new Product(002L, "Nvidia RTX 5070 TI",1600000 ),
            new Product(003L, "Intel I5 10400F", 150000)
            );
        
    }
    public List<Product> findAll(){
        return data;
    }
    public Product findById(long idProduct)
    {
        return data.stream()
           .filter(p -> p.getIdProduct().equals(idProduct))
           .findFirst()
           .orElseThrow();

    }


}

package com.secondtest.id.application2.springboot_id.models;

public class Product implements Cloneable {
    private Long idProduct;
    private String name;
    private int price;
    public Long getIdProduct() {
        return idProduct;
    }
    
    public Product(Long idProduct, String name, int price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }
    

    @Override
    public Object clone()  { //Si ocurre un error (no se puede clonar de forma automatica) lo hacemos nosotros de forma manual
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(idProduct, name, price);
        }
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    

}

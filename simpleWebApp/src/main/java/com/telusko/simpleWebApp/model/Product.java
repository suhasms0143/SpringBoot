package com.telusko.simpleWebApp.model;


// product = model MVC


import org.springframework.stereotype.Component;

@Component
public class Product {

    public Product() {

    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int prodId;
    private String prodName;
    private int price;
}

// in above using private we have to create setter and getter method
// lombok help instead of setter and getter
// add lombok in pom.xml file dependency
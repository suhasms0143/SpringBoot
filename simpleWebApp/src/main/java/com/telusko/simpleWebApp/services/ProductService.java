package com.telusko.simpleWebApp.services;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class ProductService {

    @Autowired
    ProductRepo repo;

    List<Product> products = new ArrayList<>(Arrays.asList(
           new Product(101, "iphone", 50000),
           new Product(102, "camera", 60000)));


    public List<Product>getProducts(){
        return products;

    }
// this comes through ProductController get by id
    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100,"no item",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for(int i=0; i<products.size();i++)
            if(products.get(i).getProdId() == prod.getProdId())
                index = i;
        products.set(index,prod);

    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for(int i=0; i<products.size();i++)
            if(products.get(i).getProdId() == prodId)
                index = i;

        products.remove(index);


    }
}

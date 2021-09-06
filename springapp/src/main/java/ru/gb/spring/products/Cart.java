package ru.gb.spring.products;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Scope("prototype")
public class Cart {
    ProductRepository pr;
    List<Product> carts = new ArrayList<>();

    public Cart(ProductRepository pr) {
        this.pr = pr;
    }



    public void addProduct(int id) {
        for (int i = 0; i < pr.getProducts().size(); i++) {
            if (id == pr.getProducts().get(i).getId()){
                carts.add(pr.getProducts().get(i));
            }
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < pr.getProducts().size(); i++) {
            if (id == pr.getProducts().get(i).getId()){
                carts.remove(pr.getProducts().get(i));
            }
        }
    }
}

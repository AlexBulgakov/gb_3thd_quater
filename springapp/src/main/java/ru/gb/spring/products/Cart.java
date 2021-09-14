package ru.gb.spring.products;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "Cart{" +
                "pr=" + pr +
                ", carts=" + carts +
                '}';
    }
}

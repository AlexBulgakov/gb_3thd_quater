package ru.gb.spring.products;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ProductRepository pr;
    private List<Product> carts;

    public Cart(ProductRepository pr) {
        this.pr = pr;
        this.carts = new ArrayList<>();
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

    public List<Product> getCarts() {
        return carts;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "pr=" + pr +
                ", carts=" + carts +
                '}';
    }
}

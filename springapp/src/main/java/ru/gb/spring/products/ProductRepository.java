package ru.gb.spring.products;

import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product viewListAll() {
        for (Product product : products) {
            return product;
        }
        return null;
    }

    public Product viewIdElement(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }
}

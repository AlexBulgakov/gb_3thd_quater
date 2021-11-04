package ru.gb.bulgakov.webappspring.prev;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private float cost;
    private LocalDateTime date;
    private List<Product> products;

    public Order() {
    }

    public Order(int id, LocalDateTime date, float cost, List<Product> products) {
        this.id = id;
        this.cost = cost;
        this.date = date;
        this.products = products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public float getCost() {
        return cost;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cost=" + cost +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}

package ru.gb.bulgakov.webappspring.prev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<> (
                List.of(
                        new Order(1, LocalDateTime.now(), 3000.00f, Collections.emptyList())
                )
        );
    }

    public Optional<Order> findById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst();
    }

    public List<Order> findAll() {
        return orders;
    }

    public void add(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "OrderRepository{" +
                "orders=" + orders +
                '}';
    }
}

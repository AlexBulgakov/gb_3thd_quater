package ru.gb.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gb.spring.products.Cart;
import ru.gb.spring.products.ManageCart;
import ru.gb.spring.products.ProductRepository;

@Configuration
public class ConfigSpringApp {

    @Bean
    public ProductRepository pd() {
        return new ProductRepository();
    }

    @Bean
    public Cart cart() {
        return new Cart(pd());
    }

    @Bean
    public ManageCart mc() {
        return new ManageCart(cart());
    }
}

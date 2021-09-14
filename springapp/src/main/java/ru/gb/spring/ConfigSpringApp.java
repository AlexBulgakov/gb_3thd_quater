package ru.gb.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.gb.spring.products.Cart;
import ru.gb.spring.products.ManageCart;
import ru.gb.spring.products.ProductRepository;

@Configuration
public class ConfigSpringApp {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart(productRepository());
    }

    @Bean
    public ManageCart mc() {
        return new ManageCart(cart());
    }
}

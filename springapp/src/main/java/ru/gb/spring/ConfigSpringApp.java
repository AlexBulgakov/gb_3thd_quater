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
    public Cart cart(ProductRepository productRepository) {
        return new Cart(productRepository);
    }

    @Bean
    public ManageCart mc(Cart cart) {
        return new ManageCart(cart);
    }
}

package ru.gb.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.spring.products.Cart;
import ru.gb.spring.products.ManageCart;
import ru.gb.spring.products.Product;
import ru.gb.spring.products.ProductRepository;

import java.util.Arrays;


public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpringApp.class);

        ProductRepository pd = context.getBean(ProductRepository.class);
        pd.setProducts(Arrays.asList(
                new Product(1, "Phone", 13000f),
                new Product(2, "Tablet", 23990f),
                new Product(3, "Watch", 18750f),
                new Product(4, "NoteBook", 41870f),
                new Product(5, "GamingСonsole", 13590f)
        ));

        Cart cart = context.getBean(Cart.class);
        ManageCart mc = context.getBean(ManageCart.class);
        mc.run();

    }
}

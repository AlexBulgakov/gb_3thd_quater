package ru.gb.bulgakov.webappspring.current;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.gb.bulgakov.webappspring.prev.CartConfiguration;

@Configuration
@Import(CartConfiguration.class)
public class RootWebApplicationConfig{
}

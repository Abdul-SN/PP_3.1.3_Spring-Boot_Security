package ru.kata.spring.boot_security.demo.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {


    /**
    * Добавляем контроллер просмотра для URL "/index" и устанавливаем  представления на "index".
    */
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/index", "/");
        registry.addViewController("/").setViewName("/admin/index");
    }
}

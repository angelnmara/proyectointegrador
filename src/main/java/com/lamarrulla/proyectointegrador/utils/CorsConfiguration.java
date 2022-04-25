package com.lamarrulla.proyectointegrador.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/rest/v2//**").allowedMethods("PUT", "DELETE", "GET", "POST");
                registry.addMapping("/**").allowedMethods("PUT", "DELETE", "GET", "POST");
            }
        };
    }
}

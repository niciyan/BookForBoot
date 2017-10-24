package com.example.trybook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Calculator calculator() {
        return new AddCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver() {
        return new ScannerArgumentResolver();
    }

    @Bean
    FrontEnd frontEnd() {
        return new FrontEnd();
    }
}

package com.example.trybook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
            FrontEnd frontEnd = context.getBean(FrontEnd.class);
            frontEnd.run();
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter 2 numbers like 'a b' : ");
//            ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
//            Argument argument = argumentResolver.resolve(System.in);
//            Calculator calculator = context.getBean(Calculator.class);
//            int result = calculator.calc(argument.getA(), argument.getB());
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            Calculator calculator = context.getBean(Calculator.class);
//            int result = calculator.calc(a, b);
//            System.out.println("result = " + result);
        }
    }
}

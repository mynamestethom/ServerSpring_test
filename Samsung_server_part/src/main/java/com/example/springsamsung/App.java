package com.example.springsamsung;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);

        try {
            //Консоль для визуализации бд в браузере
            Console.main(args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.example.TASC_SpringBoot.IoC_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Bean để tạo đối tượng Car và inject Engine vào
    @Bean
    public Car car(Engine engine) {
        return new Car(engine, "Honda");  // Tiêm giá trị "Honda" vào Car
    }

    @Bean
    public Engine engine() {
        return new Engine();  // Bean Engine được tạo ra và tiêm vào Car
    }
}

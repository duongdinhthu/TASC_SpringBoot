package com.example.TASC_SpringBoot.IoC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // Đánh dấu lớp này là một Spring Bean
public class Car {

    private Engine engine; // Biến lưu trữ đối tượng Engine
    private String brand;

    @Autowired
    public Car(Engine engine, @Value("${car.brand:Toyota}") String brand) {
        this.engine = engine;
        this.brand = brand;  // Inject giá trị brand từ file cấu hình hoặc mặc định
    }
    //Spring sẽ tìm kiếm một đối tượng Engine trong Spring context và tiêm nó vào khi tạo đối tượng Car.
    //Bạn không cần phải tự tạo đối tượng Engine mà chỉ cần khai báo rằng Car cần nó. Đây chính là Dependency Injection.




    public void drive() {
        System.out.println("Car " + brand + " is driving...");
        engine.start();
    }
}
//@Component: Đánh dấu lớp Car là một bean của Spring. Spring sẽ tự động quản lý đối tượng này, tức là tạo đối tượng Car và lưu trữ nó trong Spring context.
//@Autowired: Đánh dấu rằng Spring cần tiêm một đối tượng Engine vào trong Car. Khi Spring tạo Car, nó sẽ tự động tìm kiếm một bean Engine và truyền vào constructor của Car.
//Car(Engine engine): Đây là constructor của lớp Car. Spring sẽ gọi constructor này và tiêm đối tượng Engine vào.
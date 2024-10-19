package com.example.TASC_SpringBoot;

import com.example.TASC_SpringBoot.IoC_DI.Car;
import com.example.TASC_SpringBoot.life_cycle_bean.MyBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TascSpringBootApplication {

	public static void main(String[] args) {
		// Tạo ApplicationContext
		ApplicationContext context = SpringApplication.run(TascSpringBootApplication.class, args);

		// Lấy bean MyBean từ context và gọi phương thức
		MyBean myBean = context.getBean(MyBean.class);
		myBean.doSomething();

		// Tắt ứng dụng
		((ConfigurableApplicationContext) context).close();
	}

	// CommandLineRunner sẽ chạy khi ứng dụng khởi động
//	@Bean
//	public CommandLineRunner run(ApplicationContext ctx) {
//		return args -> {
//			// Lấy bean Car từ Spring Context
//			Car car = ctx.getBean(Car.class);
//			car.drive();  // Gọi phương thức drive trên đối tượng Car
//		};
//	}
}

package example.IoC_DI;

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
// CommandLineRunner sẽ chạy khi ứng dụng khởi động
//	@Bean
//	public CommandLineRunner run(ApplicationContext ctx) {
//		return args -> {
//			// Lấy bean Car từ Spring Context
//			Car car = ctx.getBean(Car.class);
//			car.drive();  // Gọi phương thức drive trên đối tượng Car
//		};
//	}
package example.life_cycle_bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.example.TASC_SpringBoot.TascSpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("Constructor: MyBean is created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: MyBean is initialized.");
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("PreDestroy: MyBean is being destroyed.");
    }
}
//public static void main(String[] args) {
//    // Tạo ApplicationContext
//    ApplicationContext context = SpringApplication.run(TascSpringBootApplication.class, args);
//
//    // Lấy bean MyBean từ context và gọi phương thức
//    MyBean myBean = context.getBean(MyBean.class);
//    myBean.doSomething();
//
//    // Tắt ứng dụng
//    ((ConfigurableApplicationContext) context).close();
//}
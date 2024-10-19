package com.example.TASC_SpringBoot.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    private String message;

    public PrototypeBean() {
        this.message = "This is a prototype bean.";
    }

    public String getMessage() {
        return message;
    }
}
// Kết quả: myBean1 và myBean2 là hai instance khác nhau
//PrototypeBean myBean1 = context.getBean(PrototypeBean.class);
//PrototypeBean myBean2 = context.getBean(PrototypeBean.class);
//System.out.println(myBean1 == myBean2); // false

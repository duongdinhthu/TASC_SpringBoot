package example.beanScope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    private String message;

    public SingletonBean() {
        this.message = "This is a singleton bean.";
    }

    public String getMessage() {
        return message;
    }
}
// Kết quả: Cả hai biến myBean1 và myBean2 đều tham chiếu đến cùng một instance
//SingletonBean myBean1 = context.getBean(SingletonBean.class);
//SingletonBean myBean2 = context.getBean(SingletonBean.class);
//System.out.println(myBean1 == myBean2); // true

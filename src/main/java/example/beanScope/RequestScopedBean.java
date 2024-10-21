package example.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class RequestScopedBean {
    private String message;

    public RequestScopedBean() {
        this.message = "This is a request scoped bean.";
    }

    public String getMessage() {
        return message;
    }
}
// Kết quả: Mỗi yêu cầu HTTP sẽ có một instance khác nhau
//@RequestMapping("/example")
//public String exampleMethod(RequestScopedBean requestBean) {
//    // Mỗi yêu cầu tới endpoint này sẽ tạo một instance mới của requestBean
//    return requestBean.getMessage();
//}

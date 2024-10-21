package introduction.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class SessionScopedBean {
    private String message;

    public SessionScopedBean() {
        this.message = "This is a session scoped bean.";
    }

    public String getMessage() {
        return message;
    }
}
// Kết quả: Mỗi session HTTP sẽ có một instance khác nhau
//@RequestMapping("/sessionExample")
//public String sessionExample(SessionScopedBean sessionBean) {
//    // Bean này sẽ tồn tại trong suốt thời gian của session
//    return sessionBean.getMessage();
//}
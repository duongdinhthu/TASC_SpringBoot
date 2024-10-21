package introduction.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("globalSession")
public class GlobalSessionScopedBean {
    private String message;

    public GlobalSessionScopedBean() {
        this.message = "This is a global session scoped bean.";
    }

    public String getMessage() {
        return message;
    }
}
// Kết quả: Mỗi global session sẽ có một instance khác nhau
//@RequestMapping("/globalSessionExample")
//public String globalSessionExample(GlobalSessionScopedBean globalSessionBean) {
//    // Bean này sẽ tồn tại trong suốt thời gian của global session
//    return globalSessionBean.getMessage();
//}

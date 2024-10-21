package introduction.IoC_DI;

import org.springframework.stereotype.Component;

@Component // Đánh dấu lớp này là một Spring Bean
public class Engine {

    public void start() {
        System.out.println("Engine started..."); // Khi động cơ bắt đầu
    }
}
//@Component: Đánh dấu lớp Engine là một Spring Bean, tương tự như lớp Car. Spring sẽ tạo và quản lý đối tượng Engine này.
//start(): Phương thức đơn giản, in ra dòng chữ "Engine started..." để mô phỏng việc động cơ khởi động.
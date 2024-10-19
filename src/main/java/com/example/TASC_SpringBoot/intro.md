Spring Framework là một nền tảng phát triển mạnh mẽ cho Java, giúp xây dựng các ứng dụng có thể mở rộng, bảo trì dễ dàng và linh hoạt.

Spring MVC (Model-View-Controller): Là một phần của Spring Framework để xây dựng ứng dụng web với mô hình MVC, giúp tách biệt logic hiển thị (View), xử lý (Controller), và quản lý dữ liệu (Model).
Spring Boot: Là một phần mở rộng của Spring Framework, giúp xây dựng các ứng dụng Spring nhanh chóng với các cấu hình tự động, không cần cấu hình thủ công phức tạp. Spring Boot phù hợp cho các dự án microservices và REST API.
2. DI (Dependency Injection) và IoC (Inversion of Control)
   DI (Dependency Injection): Là một nguyên tắc trong đó các đối tượng hoặc phụ thuộc của một đối tượng sẽ được cung cấp từ bên ngoài thay vì tự khởi tạo bên trong. Điều này giúp làm giảm sự phụ thuộc giữa các lớp và giúp test dễ dàng hơn.
   IoC (Inversion of Control): Là một mẫu thiết kế giúp tách biệt logic điều khiển của ứng dụng, thay vì để các đối tượng quản lý vòng đời của chính chúng, IoC container sẽ làm việc này. Spring sử dụng IoC để quản lý các bean.
3.
Dưới đây là những khái niệm cơ bản và hướng dẫn để bạn tìm hiểu về Spring Framework, Spring Boot, và các công cụ liên quan như Maven và Postman:

1. Giới thiệu Spring Framework
   Spring Framework là một nền tảng phát triển mạnh mẽ cho Java, giúp xây dựng các ứng dụng có thể mở rộng, bảo trì dễ dàng và linh hoạt.

Spring MVC (Model-View-Controller): Là một phần của Spring Framework để xây dựng ứng dụng web với mô hình MVC, giúp tách biệt logic hiển thị (View), xử lý (Controller), và quản lý dữ liệu (Model).
Spring Boot: Là một phần mở rộng của Spring Framework, giúp xây dựng các ứng dụng Spring nhanh chóng với các cấu hình tự động, không cần cấu hình thủ công phức tạp. Spring Boot phù hợp cho các dự án microservices và REST API.
2. DI (Dependency Injection) và IoC (Inversion of Control)
   DI (Dependency Injection): Là một nguyên tắc trong đó các đối tượng hoặc phụ thuộc của một đối tượng sẽ được cung cấp từ bên ngoài thay vì tự khởi tạo bên trong. Điều này giúp làm giảm sự phụ thuộc giữa các lớp và giúp test dễ dàng hơn.
   IoC (Inversion of Control): Là một mẫu thiết kế giúp tách biệt logic điều khiển của ứng dụng, thay vì để các đối tượng quản lý vòng đời của chính chúng, IoC container sẽ làm việc này. Spring sử dụng IoC để quản lý các bean.
3. Spring Bean, Bean Life Cycle, Bean Scope, Annotation
   Spring Bean: Là một đối tượng được quản lý bởi IoC container của Spring.
   Life Cycle của Bean: Gồm các giai đoạn như: Bean khởi tạo, cấu hình, sử dụng, và hủy. Spring cung cấp các callback để quản lý vòng đời của Bean.
   Bean Scope:
   Singleton: Mặc định, chỉ có một instance duy nhất của bean trong Spring container.
   Prototype: Một instance mới của bean sẽ được tạo mỗi khi có yêu cầu.
   Ngoài ra còn có Request, Session, GlobalSession,... dùng cho ứng dụng web.
   Annotation dùng để khai báo bean:
   @Component: Đánh dấu lớp là một bean do Spring quản lý.
   @Service: Dùng cho các lớp chứa logic nghiệp vụ.
   @Repository: Đánh dấu các lớp thao tác với cơ sở dữ liệu.
   @Controller: Đánh dấu lớp điều khiển (Controller) trong Spring MVC.
4. Các khái niệm cơ bản về Request, HttpMethod, JSON, API
   Request: Là yêu cầu từ client (người dùng) tới server (ứng dụng) thông qua giao thức HTTP.
   HttpMethod: Các phương thức HTTP cơ bản bao gồm:
   GET: Lấy dữ liệu.
   POST: Tạo mới dữ liệu.
   PUT: Cập nhật dữ liệu.
   DELETE: Xóa dữ liệu.
   JSON (JavaScript Object Notation): Là định dạng dữ liệu thường dùng trong API để truyền thông tin giữa client và server.
   API (Application Programming Interface): Là giao diện cho phép các ứng dụng giao tiếp với nhau. Một trong những API phổ biến là RESTful API dùng HTTP để truyền dữ liệu.
5. Demo: Tạo Spring Boot Project và Cài đặt Môi trường
   a. Cài đặt Môi trường:
   Bước 1: Cài đặt Java Development Kit (JDK).
   Bước 2: Cài đặt IntelliJ IDEA.
   Bước 3: Tạo project Spring Boot bằng Spring Initializr:
   Truy cập vào https://start.spring.io/ hoặc dùng Spring Initializr trực tiếp trong IntelliJ để tạo project mới.
   Các dependency quan trọng: Spring Web, Spring Data JPA, H2 Database (hoặc MySQL nếu cần), Lombok,...
   b. Tạo Project Spring Boot:
   Bước 1: Mở IntelliJ, chọn New Project > Spring Initializr.
   Bước 2: Chọn dependency cần thiết như Spring Web để phát triển API.
   Bước 3: Tạo các controller, service, và repository theo mô hình MVC.
6. Sơ lược về Maven và Cách Sử dụng
   Maven là một công cụ quản lý dự án và phụ thuộc (dependencies) trong các dự án Java.

File chính: pom.xml (Project Object Model), nơi khai báo các dependency, plugins, và cấu hình build.
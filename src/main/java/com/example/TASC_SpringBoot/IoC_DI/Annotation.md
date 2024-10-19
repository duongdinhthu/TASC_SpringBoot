@Service: Chứa logic nghiệp vụ chính của hệ thống, ví dụ như quản lý người dùng, sản phẩm, đặt hàng.
@Repository: Tương tác với cơ sở dữ liệu, như tìm kiếm, thêm, xóa hoặc cập nhật dữ liệu.
@Component: Dùng cho các lớp không liên quan trực tiếp đến các chức năng CRUD, ví dụ như gửi email, tạo file PDF, hoặc tính toán các dữ liệu phụ trợ.
@Component
Định nghĩa: Dùng để đánh dấu một lớp là một component Spring. Spring sẽ tự động quét và quản lý nó.
Khi nào dùng:
Khi bạn muốn Spring tự động phát hiện và đăng ký lớp như một bean.
Khi bạn muốn sử dụng tiêm phụ thuộc (dependency injection) một cách đơn giản.
@Bean
Định nghĩa: Dùng trong một lớp cấu hình để định nghĩa một phương thức tạo ra một bean. Bạn có thể tùy chỉnh cách tạo bean.
Khi nào dùng:
Khi bạn cần cấu hình thủ công hoặc muốn tạo một bean từ một thư viện bên thứ ba mà không thể chú thích @Component.
Khi bạn muốn cung cấp tham số hoặc cấu hình đặc biệt cho bean.
Tóm lại:
Sử dụng @Component cho các lớp trong ứng dụng mà bạn muốn Spring tự động quản lý.
Sử dụng @Bean cho các lớp mà bạn cần cấu hình cụ thể hoặc cho thư viện bên thứ ba.

khi bạn sử dụng @Bean, bạn phải khai báo trong một lớp được đánh dấu bằng @Configuration. Dưới đây là một số điểm chính về cách thức hoạt động của @Bean và @Configuration:

1. @Configuration
   Định nghĩa: Annotation này được sử dụng để đánh dấu một lớp như một lớp cấu hình trong Spring. Các lớp này thường chứa các phương thức được chú thích bằng @Bean, trong đó mỗi phương thức tạo ra một bean.
   Chức năng: Lớp được đánh dấu bằng @Configuration cho phép bạn định nghĩa các bean trong ứng dụng của mình. Spring sẽ quản lý vòng đời của các bean này.
2. @Bean
   Khai báo: Phương thức được đánh dấu bằng @Bean trong lớp cấu hình sẽ được gọi để tạo ra một instance của bean khi cần thiết.
   Không thể sử dụng ở nơi khác: Bạn không thể sử dụng @Bean bên ngoài một lớp được chú thích là @Configuration. Nếu không, Spring sẽ không nhận ra phương thức đó là một phương thức tạo bean.
   Tóm lại
   Cặp bài trùng: @Configuration và @Bean là một cặp bài trùng. Bạn không thể khai báo một bean mà không có một lớp cấu hình.
   Sử dụng @Configuration: Bạn cần khai báo @Configuration cho các lớp chứa các phương thức @Bean.



Dùng @Bean khi bạn cần khởi tạo phức tạp hoặc khi bạn muốn tạo bean từ các thư viện bên ngoài.
Dùng @Component khi bạn chỉ cần đánh dấu các class để Spring tự động quản lý, đặc biệt cho các lớp dịch vụ và DAO.
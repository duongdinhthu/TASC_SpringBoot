Trong Spring, vòng đời của một bean bao gồm một loạt các bước mà Spring thực hiện từ khi tạo ra bean cho đến khi nó bị hủy. Dưới đây là tóm tắt về vòng đời của một bean trong Spring:

1. Tạo Bean
   Instantiation: Spring tạo một instance của bean bằng cách sử dụng constructor hoặc factory method.
2. Thiết lập thuộc tính
   Dependency Injection: Sau khi bean được tạo, Spring tiêm các phụ thuộc (nếu có) vào bean thông qua constructor, setter, hoặc trực tiếp vào các thuộc tính.
3. Xử lý các callback
   PostConstruct: Nếu bean có phương thức được chú thích bằng @PostConstruct, Spring sẽ gọi phương thức này sau khi thiết lập các thuộc tính của bean. Đây là nơi bạn có thể thực hiện các công việc khởi tạo bổ sung.

Custom Initializer: Nếu bạn định nghĩa một phương thức khởi tạo tùy chỉnh trong cấu hình, Spring sẽ gọi phương thức này sau khi thiết lập thuộc tính nhưng trước khi bean được sử dụng.

4. Sử dụng Bean
   Bean đã sẵn sàng để được sử dụng trong ứng dụng. Các phương thức của bean có thể được gọi bởi các component khác.
5. Hủy Bean
   PreDestroy: Khi ứng dụng ngừng hoặc bean không còn cần thiết, Spring sẽ gọi phương thức được chú thích bằng @PreDestroy (nếu có) để thực hiện các công việc dọn dẹp trước khi bean bị hủy.

Custom Destroy Method: Nếu bạn định nghĩa một phương thức hủy tùy chỉnh trong cấu hình, Spring sẽ gọi phương thức này trước khi hủy bean.

6. Giải phóng tài nguyên
   Bean sẽ được giải phóng khỏi bộ nhớ và tài nguyên sẽ được dọn dẹp.
   Lưu ý về vòng đời bean
   Scope của bean: Vòng đời của bean có thể thay đổi tùy thuộc vào scope (phạm vi) của nó, ví dụ:
   Singleton: Một instance duy nhất của bean sẽ được tạo ra và dùng chung trong toàn bộ ứng dụng.
   Prototype: Một instance mới sẽ được tạo ra mỗi khi bean được yêu cầu.
   Các scope khác như request, session, globalSession cũng có vòng đời riêng biệt tùy thuộc vào ngữ cảnh.


Khi nào nên sử dụng:
@PostConstruct:

Bạn nên sử dụng @PostConstruct khi cần thực hiện một số thao tác khởi tạo sau khi bean đã được tạo và các phụ thuộc của nó đã được tiêm vào. Ví dụ:
Khởi tạo dữ liệu.
Thiết lập kết nối đến cơ sở dữ liệu hoặc dịch vụ bên ngoài.
Đăng ký listener hoặc thực hiện các thao tác khác.
@PreDestroy:

Bạn nên sử dụng @PreDestroy khi cần thực hiện các thao tác dọn dẹp trước khi bean bị hủy, chẳng hạn:
Đóng kết nối đến cơ sở dữ liệu.
Giải phóng tài nguyên.
Dừng các tác vụ nền hoặc thread.
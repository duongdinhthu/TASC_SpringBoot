Dependency: Thêm spring-boot-starter-validation vào pom.xml để sử dụng các annotation kiểm tra tính hợp lệ.

Annotation: Sử dụng các annotation như @NotBlank, @Email, @Min, và @NotNull trên các thuộc tính trong entity để định nghĩa quy tắc validation.

@Valid: Thêm annotation @Valid vào phương thức controller để kích hoạt việc kiểm tra tính hợp lệ của dữ liệu nhận từ client. Nếu dữ liệu không hợp lệ, Spring sẽ tự động trả về mã trạng thái 400 (Bad Request).

Xử lý lỗi: Sử dụng @ControllerAdvice để tạo một lớp xử lý lỗi toàn cục, cho phép bạn trả về thông báo lỗi rõ ràng khi có lỗi validation xảy ra.

@NotBlank:

Ý nghĩa: Đảm bảo rằng chuỗi không rỗng và không chỉ chứa khoảng trắng.
Sử dụng: Thường dùng cho các trường nhập liệu kiểu văn bản, như tên hoặc mô tả.
@Email:

Ý nghĩa: Kiểm tra rằng chuỗi có định dạng email hợp lệ.
Sử dụng: Thường dùng cho các trường nhập liệu email để đảm bảo rằng người dùng nhập đúng định dạng email.
@Min(value):

Ý nghĩa: Kiểm tra rằng giá trị của trường phải lớn hơn hoặc bằng giá trị đã chỉ định.
Sử dụng: Thường dùng cho các trường số, ví dụ như tuổi hoặc số lượng sản phẩm, để đảm bảo giá trị không nhỏ hơn một số cụ thể.
@NotNull:

Ý nghĩa: Đảm bảo rằng trường không được là null.
Sử dụng: Có thể sử dụng cho bất kỳ loại dữ liệu nào để xác định rằng trường đó phải có giá trị.

@Size(min, max):

Ý nghĩa: Kiểm tra chiều dài của chuỗi, danh sách, hoặc mảng nằm trong khoảng từ min đến max.
Sử dụng: Thường dùng cho các trường văn bản, như mô tả sản phẩm.
@Pattern(regexp):

Ý nghĩa: Kiểm tra rằng giá trị của trường khớp với biểu thức chính quy đã chỉ định.
Sử dụng: Dùng cho các trường mà cần một định dạng cụ thể, chẳng hạn như mã bưu điện hoặc số điện thoại.
@Future và @Past:

Ý nghĩa: Kiểm tra rằng ngày phải là trong tương lai (@Future) hoặc trong quá khứ (@Past).
Sử dụng: Thường dùng cho các trường ngày tháng để xác định tính hợp lệ của thời gian.
@Valid:

Ý nghĩa: Được sử dụng để chỉ định rằng các thuộc tính của đối tượng con cũng nên được kiểm tra theo quy tắc xác thực.
Sử dụng: Dùng trong controller để xác thực đối tượng con trong một đối tượng lớn hơn.
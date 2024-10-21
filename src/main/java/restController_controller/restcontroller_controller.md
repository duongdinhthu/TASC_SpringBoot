@RestController:

Dùng để xây dựng các API RESTful.
Khi bạn gửi yêu cầu (request) từ Postman hoặc bất kỳ client nào, API sẽ trả về dữ liệu ở định dạng JSON hoặc XML (tùy vào cấu hình) mà không có HTML.
Thích hợp cho việc phát triển ứng dụng web tách biệt (frontend - backend), nơi frontend có thể là ứng dụng JavaScript như React, Angular, v.v.
@Controller:

Dùng để xây dựng các ứng dụng web dựa trên mô hình MVC (Model-View-Controller).
Khi bạn gửi yêu cầu từ trình duyệt web, controller này thường trả về HTML hoặc trang template, có thể kết hợp với dữ liệu từ backend để hiển thị.
Thích hợp cho ứng dụng web nơi bạn muốn render một trang HTML hoàn chỉnh.
Ví dụ:
API với @RestController:

Khi bạn gửi yêu cầu GET tới /api/v1/customers, API trả về danh sách khách hàng dưới dạng JSON.
Controller với @Controller:

Khi bạn gửi yêu cầu GET tới /customers, controller có thể trả về một trang HTML hiển thị danh sách khách hàng.
Kết luận:
REST API (với @RestController): Dữ liệu (JSON) cho frontend.
Web ứng dụng (với @Controller): Trang HTML cho trình duyệt.
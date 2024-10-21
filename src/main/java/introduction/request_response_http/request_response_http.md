Request (Yêu cầu) là một thông điệp mà client 
(ví dụ: trình duyệt hoặc ứng dụng di động) gửi tới server để yêu cầu một hành động cụ thể (ví dụ: lấy dữ liệu, gửi dữ liệu).

Response (Phản hồi) là thông điệp mà server trả lời lại client sau khi xử lý xong yêu cầu.
Response thường bao gồm trạng thái (status code), dữ liệu (nếu có), và các thông tin bổ sung khác.

HTTP Methods (Các phương thức HTTP)
HTTP methods chỉ định hành động cụ thể mà request muốn thực hiện trên tài nguyên (resources) tại server. Các phương thức chính bao gồm:

GET: Lấy dữ liệu từ server (chỉ đọc).
POST: Gửi dữ liệu mới tới server để tạo mới một tài nguyên.
PUT: Cập nhật toàn bộ một tài nguyên hiện có trên server.
PATCH: Cập nhật một phần tài nguyên hiện có.
DELETE: Xóa một tài nguyên trên server.
JSON (JavaScript Object Notation)
JSON là một định dạng dữ liệu nhẹ, dễ đọc, thường được sử dụng để trao đổi dữ liệu giữa client và server. 
Một đối tượng JSON bao gồm các cặp khóa-giá trị và có thể chứa các đối tượng lồng nhau, mảng, chuỗi, số, boolean, hoặc giá trị null.



API (Application Programming Interface)
API là tập hợp các quy tắc cho phép các ứng dụng hoặc dịch vụ giao tiếp với nhau. Một API có thể được thiết kế để cho phép client yêu cầu dữ liệu hoặc gửi dữ liệu lên server. Web API (thường được gọi là REST API hoặc HTTP API) sử dụng giao thức HTTP để trao đổi dữ liệu giữa client và server.

REST API là một loại API phổ biến sử dụng các HTTP methods để thực hiện các thao tác trên tài nguyên. Cách thức giao tiếp giữa client và server theo REST thường sử dụng JSON cho dữ liệu.

Quy trình chung khi client gửi một request tới server qua API
Client (ứng dụng di động, trình duyệt) gửi một HTTP request tới server, có thể kèm theo dữ liệu JSON (trong body đối với POST, PUT, PATCH).
Server nhận request, xử lý yêu cầu, tương tác với cơ sở dữ liệu (nếu cần), sau đó chuẩn bị và gửi lại HTTP response.
Response thường sẽ chứa thông tin như:
Status code: Ví dụ: 200 OK (thành công), 404 Not Found (không tìm thấy tài nguyên).
Body (thường là JSON): Dữ liệu kết quả hoặc thông tin về lỗi.


API (Application Programming Interface) là giao diện để frontend và backend giao tiếp với nhau. Frontend có thể là ứng dụng web, mobile hoặc bất kỳ hệ thống nào khác.
Endpoint: Là một URL cụ thể (API link) mà frontend gọi đến, được xây dựng ở backend trong các controller để xử lý các thao tác như GET, POST, PUT, DELETE.
Như vậy, API chính là cầu nối giữa frontend và backend. Frontend sẽ gửi các yêu cầu đến API (được build từ backend controller) và backend sẽ trả về dữ liệu hoặc kết quả xử lý.

Nếu bạn muốn chi tiết thêm về cách gọi API từ frontend hay cách cấu hình API nâng cao, mình có thể giải thích thêm.







Sử dụng HTTPS để mã hóa dữ liệu.
Xác thực bằng cách sử dụng OAuth 2.0 hoặc API Key.
Ủy quyền bằng cách kiểm tra quyền truy cập (RBAC/ABAC).
Giới hạn tần suất request để ngăn chặn lạm dụng.
Xác thực đầu vào để tránh các cuộc tấn công như SQL Injection, XSS.
Sử dụng CORS để kiểm soát truy cập từ các domain khác.
Ghi log và giám sát hoạt động API.
Bảo vệ trước các lỗ hổng bảo mật phổ biến (SQL Injection, XSS, CSRF).
Sử dụng HMAC để xác thực thông điệp.
Ẩn thông tin nhạy cảm trong response.
Những bước này sẽ giúp bạn bảo vệ API khỏi các mối đe dọa phổ biến 
và đảm bảo dữ liệu được an toàn trong quá trình truyền tải và xử lý.





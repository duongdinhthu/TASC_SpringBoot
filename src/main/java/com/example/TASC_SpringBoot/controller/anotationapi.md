@PathVariable là cách để lấy dữ liệu từ đường dẫn URL.
@RequestParam là cách để lấy dữ liệu từ chuỗi truy vấn trong URL.
@RequestBody là cách để lấy dữ liệu từ body yêu cầu.

Khi thiết kế API, việc quyết định sử dụng Query Parameters hay Path Variables (các tham số trong đường dẫn) phụ thuộc vào ngữ cảnh và cách mà bạn muốn tổ chức thông tin trong URL. Dưới đây là một số hướng dẫn giúp bạn quyết định khi nào nên sử dụng từng loại:

1. Query Parameters
   Khi nào sử dụng:

Lọc dữ liệu: Khi bạn cần lọc hoặc phân trang kết quả trả về. Ví dụ, trong một API lấy danh sách sản phẩm, bạn có thể sử dụng query parameters để chỉ định các tiêu chí lọc:

Ví dụ: GET /api/products?category=electronics&sort=price_asc&page=1
Tìm kiếm: Khi bạn cần thực hiện tìm kiếm dựa trên các tiêu chí không xác định trước.

Ví dụ: GET /api/customers?name=John
Thông tin không quan trọng: Thông tin có thể không cần thiết để truy cập cụ thể vào tài nguyên, mà chỉ hỗ trợ việc tìm kiếm hoặc phân loại.

Cách thức sử dụng:

Sử dụng trong URL sau dấu ? và phân tách các tham số bằng dấu &.
2. Path Variables
   Khi nào sử dụng:

Xác định tài nguyên cụ thể: Khi bạn cần chỉ định một tài nguyên cụ thể mà bạn muốn truy cập hoặc thao tác.

Ví dụ: GET /api/customers/{id} để lấy thông tin của một khách hàng cụ thể.
Xác định cấu trúc dữ liệu phân cấp: Khi bạn muốn thể hiện mối quan hệ giữa các tài nguyên.

Ví dụ: GET /api/orders/{orderId}/products để lấy danh sách sản phẩm trong một đơn hàng cụ thể.
Cách thức sử dụng:

Sử dụng trong đường dẫn URL và xác định các biến cần thiết trong dấu {}.
3. Request Bodies (Object)
   Khi nào sử dụng:

Gửi dữ liệu phức tạp: Khi bạn cần gửi một đối tượng với nhiều thuộc tính hoặc cấu trúc lồng nhau (như JSON).
Cập nhật dữ liệu: Khi bạn cần gửi một đối tượng để cập nhật dữ liệu của một tài nguyên đã tồn tại.

Ví dụ: PUT /api/customers/{id} với body là đối tượng khách hàng cần cập nhật.
Thực hiện hành động: Khi bạn cần thực hiện một hành động mà cần thông tin phức tạp (như đặt hàng, thanh toán, v.v.).

Ví dụ: POST /api/orders với body là đối tượng chứa thông tin đơn hàng và sản phẩm.!



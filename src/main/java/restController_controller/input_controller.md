1. Path Variables
   Path variables là các tham số được định nghĩa trực tiếp trong URL. Chúng thường được sử dụng để xác định một tài nguyên cụ thể.

Cách sử dụng: Sử dụng annotation @PathVariable để lấy giá trị của tham số từ URL.

2. Query Parameters
   Query parameters là các tham số được thêm vào cuối URL, thường được sử dụng để lọc hoặc phân trang dữ liệu.

Cách sử dụng: Sử dụng annotation @RequestParam để lấy giá trị của tham số từ query string.

3. Request Body
   Request body chứa dữ liệu mà client gửi đến server, thường được sử dụng trong các yêu cầu POST và PUT để tạo hoặc cập nhật tài nguyên.

Cách sử dụng: Sử dụng annotation @RequestBody để chuyển đổi và lấy dữ liệu JSON từ body của yêu cầu HTTP.

4. Request Headers
   Request headers chứa thông tin bổ sung về yêu cầu HTTP. Điều này có thể bao gồm thông tin như loại nội dung, thông tin xác thực, và nhiều hơn nữa.

Cách sử dụng: Sử dụng annotation @RequestHeader để lấy giá trị từ headers của yêu cầu.

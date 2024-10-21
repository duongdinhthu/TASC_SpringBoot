Routing trong Spring Boot
Routing là quá trình xác định cách mà các yêu cầu HTTP sẽ được chuyển tới các phương thức trong controller. Trong Spring Boot, routing được thực hiện thông qua các annotation như @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, và @RequestMapping.

1. Cách hoạt động của Routing
   Khi một yêu cầu HTTP được gửi tới một ứng dụng Spring Boot, hệ thống sẽ:

Xác định phương thức HTTP (GET, POST, PUT, DELETE, v.v.).
Tìm kiếm controller và phương thức nào có annotation tương ứng với URL và phương thức đó.
Gọi phương thức đó để xử lý yêu cầu.
2. Các loại Mapping
@RequestMapping: Sử dụng để ánh xạ một URL đến một phương thức trong controller. Có thể chỉ định phương thức HTTP cụ thể và các tham số khác như produces, consumes, v.v.

@GetMapping: Là một phiên bản rút gọn của @RequestMapping cho yêu cầu GET.

@PostMapping: Dùng cho yêu cầu POST.

@PutMapping: Dùng cho yêu cầu PUT.

@DeleteMapping: Dùng cho yêu cầu DELETE.

Routing trong Spring Boot rất linh hoạt và mạnh mẽ. 
Bạn có thể dễ dàng ánh xạ các yêu cầu đến các phương thức cụ thể trong controller dựa vào URL, phương thức HTTP và các tham số khác.
Điều này giúp tạo ra các API dễ sử dụng và rõ ràng cho người dùng.


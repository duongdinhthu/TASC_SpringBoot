Để xử lý ngoại lệ (exception handling) trong ứng dụng Spring Boot, bạn có thể sử dụng một số phương pháp, chẳng hạn như:

@ControllerAdvice: Annotation này cho phép bạn định nghĩa một lớp xử lý ngoại lệ toàn cục cho toàn bộ ứng dụng. Bất kỳ ngoại lệ nào được ném ra từ các controller đều có thể được xử lý ở đây.

@ExceptionHandler: Annotation này cho phép bạn xử lý ngoại lệ cụ thể trong một phương thức trong controller hoặc trong lớp có annotation @ControllerAdvice.

ResponseEntityExceptionHandler: Bạn có thể kế thừa lớp này để tùy chỉnh cách mà các ngoại lệ chuẩn được xử lý và trả về.


@ControllerAdvice: Cho phép xử lý ngoại lệ toàn cục trong ứng dụng.
@ExceptionHandler: Cho phép bạn định nghĩa phương thức xử lý ngoại lệ cụ thể.
ResourceNotFoundException: Ngoại lệ tùy chỉnh để ném khi không tìm thấy tài nguyên.
ResponseEntity: Được sử dụng để xây dựng phản hồi với mã trạng thái HTTP và thông điệp.
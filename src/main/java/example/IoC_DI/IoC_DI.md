Quá trình hoạt động trong Spring Boot:
IoC: Khi bạn chạy ứng dụng, Spring Boot sẽ quét tất cả các lớp đánh dấu bằng @Component (như Car, Engine) và tự động tạo các bean.
DI: Khi tạo đối tượng Car, Spring sẽ tìm kiếm các phụ thuộc của Car (trong trường hợp này là Engine), và tiêm đối tượng Engine vào Car thông qua constructor, 
hoặc qua setter method nếu dùng @Autowired trên setter.
CORS bảo vệ API của bạn khỏi việc bị truy cập từ các nguồn không đáng tin cậy. Trong Spring Boot, bạn có thể cấu hình CORS dễ dàng:

@Configuration
public class CorsConfig implements WebMvcConfigurer {
@Override
public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/api/**")
.allowedOrigins("https://trusted-domain.com")
.allowedMethods("GET", "POST", "PUT", "DELETE");
}
}






2. Spring Security để Authentication và Authorization
   Spring Security là một giải pháp mạnh mẽ giúp bảo vệ API của bạn khỏi các cuộc tấn công phổ biến. Nó cung cấp xác thực (authentication) và ủy quyền (authorization) cho các request HTTP.

Authentication (Xác thực): Spring Security hỗ trợ nhiều phương thức xác thực, như Basic Auth, Form-based Auth, JWT (JSON Web Tokens), OAuth 2.0, LDAP, và nhiều hơn nữa.

Ví dụ: Sử dụng JWT cho API bảo mật:

JWT là một chuỗi mã hóa chứa các thông tin về người dùng (claims). Sau khi người dùng đăng nhập thành công, họ sẽ nhận được JWT và gửi nó kèm theo trong các request sau.


Authentication
JWT:
@RestController
@RequestMapping("/api")
public class SecureApiController {
@GetMapping("/secure-data")
public ResponseEntity<String> getSecureData(@AuthenticationPrincipal UserDetails userDetails) {
return ResponseEntity.ok("Secure Data for user: " + userDetails.getUsername());
}
}




Authorization (Ủy quyền)
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin-data")
public ResponseEntity<String> getAdminData() {
return ResponseEntity.ok("This is admin data");
}

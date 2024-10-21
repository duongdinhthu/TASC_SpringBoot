Xác thực đầu vào giúp ngăn ngừa các lỗ hổng bảo mật phổ biến như SQL Injection và XSS.

Bạn có thể sử dụng Bean Validation API với các annotations như @NotNull, @Size, @Pattern trong Java:




@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody User user) {
        return ResponseEntity.ok("User created successfully");
    }
}

public class User {
@NotNull
@Size(min = 3, max = 30)
private String username;

    @NotNull
    @Email
    private String email;
}

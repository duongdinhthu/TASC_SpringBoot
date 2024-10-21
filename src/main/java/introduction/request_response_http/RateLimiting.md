Rate limiting giúp hạn chế số lượng request mà một người dùng hoặc ứng dụng có thể gửi đến API trong một khoảng thời gian nhất định.

Trong Java, bạn có thể sử dụng thư viện Bucket4j để cài đặt rate limiting cho các API endpoint:



@RestController
@RequestMapping("/api")
public class RateLimitedController {
private final Bucket bucket = Bucket4j.builder()
.addLimit(Bandwidth.classic(10, Refill.greedy(10, Duration.ofMinutes(1))))
.build();

    @GetMapping("/limited")
    public ResponseEntity<String> getRateLimitedData() {
        if (bucket.tryConsume(1)) {
            return ResponseEntity.ok("Request success");
        } else {
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body("Too many requests");
        }
    }
}

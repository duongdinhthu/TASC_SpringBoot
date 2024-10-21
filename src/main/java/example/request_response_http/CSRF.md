CSRF (Cross-Site Request Forgery) Protection
CSRF là một kỹ thuật tấn công khi một người dùng đã đăng nhập thực hiện một hành động không mong muốn trên một trang web.

Trong các API REST, nếu bạn không sử dụng cookies để xác thực người dùng, bạn có thể tắt CSRF bảo vệ vì JWT và OAuth 2.0 không cần CSRF bảo vệ.


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception {
http
.csrf().disable() // Tắt CSRF bảo vệ cho các API REST
.authorizeRequests()
.anyRequest().authenticated();
}
}

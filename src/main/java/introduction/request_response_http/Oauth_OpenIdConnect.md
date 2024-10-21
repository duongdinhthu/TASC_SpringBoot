OAuth 2.0 và OpenID Connect
   OAuth 2.0 và OpenID Connect là các chuẩn xác thực và ủy quyền hiện đại, thường được sử dụng trong các ứng dụng Java backend để cung cấp bảo mật mạnh mẽ cho API.

Với Spring Boot, bạn có thể sử dụng thư viện Spring Security OAuth2 để tích hợp OAuth 2.0 một cách dễ dàng.


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception {
http
.authorizeRequests()
.antMatchers("/public/**").permitAll()
.anyRequest().authenticated()
.and()
.oauth2Login();
}
}




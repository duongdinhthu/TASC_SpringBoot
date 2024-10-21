chúng ta có thể hiểu JPA là con , ORM là cha
ORM: Kỹ thuật tổng quát để ánh xạ đối tượng với cơ sở dữ liệu.
JPA: Chuẩn trong Java để sử dụng ORM, cho phép bạn làm việc với các framework ORM một cách dễ dàng và nhất quán.


Spring Data JPA là một triển khai của ORM, cụ thể là nó dựa trên JPA (Java Persistence API), một tiêu chuẩn của Java cho việc ánh xạ các đối tượng Java với các bảng trong cơ sở dữ liệu quan hệ. Dưới đây là cách Spring JPA và ORM liên quan đến nhau:

1. JPA là gì?
   JPA (Java Persistence API) là một API chuẩn của Java, cung cấp các cơ chế để ánh xạ (mapping) dữ liệu giữa các đối tượng Java và cơ sở dữ liệu quan hệ. JPA định nghĩa các quy tắc và tiêu chuẩn về cách ánh xạ các lớp Java với các bảng trong cơ sở dữ liệu, nhưng nó không phải là một thư viện cụ thể. JPA chỉ cung cấp một giao diện (interface) để thực hiện ánh xạ này.

Các ORM frameworks như Hibernate, EclipseLink, hay OpenJPA đều là các triển khai cụ thể của JPA, cung cấp các chức năng cụ thể để thực hiện những gì mà JPA yêu cầu.

2. Spring Data JPA và ORM
   Spring Data JPA là một phần của hệ sinh thái Spring, được xây dựng dựa trên JPA và cung cấp các tính năng mạnh mẽ giúp dễ dàng làm việc với các cơ sở dữ liệu quan hệ.

Spring Data JPA sử dụng JPA và một ORM framework (thường là Hibernate) ở phía dưới để thực hiện quá trình ánh xạ giữa các đối tượng Java và các bảng trong cơ sở dữ liệu.

Spring Data JPA cung cấp các lớp trừu tượng và phương thức tiện lợi để bạn không cần phải viết thủ công các truy vấn SQL phức tạp và tập trung vào logic nghiệp vụ. Khi bạn sử dụng JpaRepository trong Spring Boot, bạn thực sự đang sử dụng một lớp bao bọc xung quanh JPA để gọi đến ORM (như Hibernate).

3. Spring Data JPA và Hibernate
   Hibernate là một ORM framework phổ biến và là triển khai thường gặp của JPA. Khi bạn sử dụng Spring Data JPA trong ứng dụng Spring Boot, Hibernate thường được sử dụng mặc định để quản lý việc ánh xạ đối tượng và truy vấn cơ sở dữ liệu.

Tóm lại, Spring Data JPA:

Là một triển khai của JPA, cung cấp một giao diện đơn giản hơn để làm việc với JPA.
Dựa trên một ORM framework (như Hibernate) để thực hiện quá trình ánh xạ đối tượng và quản lý dữ liệu.
Giúp bạn dễ dàng làm việc với cơ sở dữ liệu thông qua các phương thức được định nghĩa sẵn mà không cần viết truy vấn SQL thủ công.





khai báo một Entity trong JPA, nó sẽ được tự động ánh xạ (mapping) đến một bảng trong cơ sở dữ liệu. Điều này chính là một phần của JPA và cách nó hoạt động để tạo ra sự kết nối giữa các đối tượng Java và cơ sở dữ liệu.

Cách thức hoạt động:
Khi bạn đánh dấu một lớp Java là Entity (bằng cách sử dụng annotation @Entity), JPA sẽ hiểu rằng lớp đó đại diện cho một bảng trong cơ sở dữ liệu.
Các thuộc tính (fields) trong lớp Entity sẽ được ánh xạ tới các cột trong bảng tương ứng.
Annotation như @Table (để chỉ rõ tên bảng) và @Column (để chỉ rõ tên cột) có thể được sử dụng để tùy chỉnh cách ánh xạ.





Cách JPA xử lý:
Khi ứng dụng Spring Boot khởi động, JPA sẽ kiểm tra tất cả các lớp được đánh dấu là Entity.
Dựa trên cấu hình, JPA sẽ kết nối với cơ sở dữ liệu, kiểm tra xem bảng có tồn tại hay không, và ánh xạ các lớp Entity đến các bảng tương ứng.
Các thao tác CRUD (create, read, update, delete) sau đó có thể được thực hiện trên các đối tượng Entity, và JPA sẽ chuyển các thao tác này thành các câu lệnh SQL tương ứng để tương tác với cơ sở dữ liệu.



@OneToMany, @ManyToOne, @OneToOne, @ManyToMany:
@JoinColumn:
@Embedded và @Embeddable:@Embedded: Sử dụng để nhúng một đối tượng khác vào một entity.

@Embeddable: Được sử dụng trên lớp Java để chỉ định rằng lớp này có thể được nhúng vào một entity khác.
@Transient:@Transient:
Được sử dụng để chỉ định rằng một thuộc tính sẽ không được lưu vào cơ sở dữ liệu.

Thuộc tính này chỉ tồn tại trong ứng dụng và không có liên quan đến cơ sở dữ liệu.




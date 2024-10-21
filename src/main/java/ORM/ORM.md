1. ORM là gì?
   ORM (Object-Relational Mapping) là một kỹ thuật lập trình giúp chuyển đổi dữ liệu giữa hệ thống hướng đối tượng (như các lớp và đối tượng trong Java) và hệ thống quan hệ (như bảng và hàng trong cơ sở dữ liệu). ORM cung cấp một lớp trung gian giữa ứng dụng và cơ sở dữ liệu, cho phép các lập trình viên làm việc với cơ sở dữ liệu thông qua các đối tượng mà không cần phải viết các câu lệnh SQL thủ công.

Thay vì phải xử lý việc chuyển đổi dữ liệu giữa các bảng và các đối tượng trong mã, ORM tự động hóa quá trình này bằng cách ánh xạ (map) các bảng cơ sở dữ liệu thành các lớp đối tượng trong ứng dụng.

2. Sử dụng ORM mang lại lợi ích như thế nào cho ứng dụng?
   Giảm thiểu mã nguồn: ORM giảm thiểu số lượng mã nguồn cần viết để thao tác với cơ sở dữ liệu. Bạn không cần viết thủ công các truy vấn SQL phức tạp, vì ORM có thể tự động hóa việc này.

Tăng năng suất lập trình: Lập trình viên có thể tập trung vào logic nghiệp vụ của ứng dụng mà không cần quan tâm nhiều đến cách dữ liệu được lưu trữ hoặc truy xuất từ cơ sở dữ liệu.

Tính bảo trì cao: Mã sử dụng ORM dễ bảo trì hơn vì nó trừu tượng hóa các thao tác liên quan đến cơ sở dữ liệu, giúp mã rõ ràng và dễ hiểu.

Tự động hóa các tác vụ: ORM có thể tự động xử lý các thao tác phức tạp như quản lý quan hệ giữa các bảng (foreign key), ánh xạ một-nhiều (one-to-many), nhiều-nhiều (many-to-many), v.v.

Bảo mật tốt hơn: Như đã đề cập trước đó, ORM giúp ngăn ngừa tấn công SQL Injection bằng cách sử dụng prepared statements và parameterized queries, làm cho việc thao tác dữ liệu an toàn hơn.

Quản lý quan hệ phức tạp: ORM cung cấp các công cụ dễ sử dụng để quản lý các quan hệ phức tạp giữa các bảng, giúp lập trình viên xử lý các mối quan hệ như One-to-One, One-to-Many, Many-to-One, và Many-to-Many một cách dễ dàng.

3. Cơ chế hoạt động của ORM như thế nào?
   ORM hoạt động như một lớp trung gian giữa mã ứng dụng và cơ sở dữ liệu. Cơ chế hoạt động cơ bản bao gồm các bước sau:

Ánh xạ đối tượng - bảng: ORM ánh xạ các lớp và đối tượng trong mã Java của bạn với các bảng và hàng trong cơ sở dữ liệu. Mỗi trường trong một lớp Java có thể ánh xạ đến một cột trong bảng tương ứng.

Tạo các truy vấn tự động: Khi bạn thao tác với các đối tượng trong ứng dụng (như thêm, cập nhật, xóa hoặc lấy dữ liệu), ORM sẽ tự động chuyển đổi các thao tác này thành các câu lệnh SQL tương ứng và thực thi chúng trên cơ sở dữ liệu.

Quản lý phiên làm việc (Session): ORM quản lý một phiên làm việc (session) để theo dõi các thay đổi trên các đối tượng và quyết định khi nào cần thực thi truy vấn với cơ sở dữ liệu.

Tối ưu hóa truy vấn: ORM sử dụng các kỹ thuật tối ưu hóa như lazy loading (tải dữ liệu khi cần thiết) và caching (bộ nhớ đệm) để cải thiện hiệu suất và giảm thiểu truy vấn không cần thiết đến cơ sở dữ liệu.

4. So sánh performance của việc sử dụng ORM vs JDBC
   ORM:

Ưu điểm:
Giảm mã cần viết và duy trì.
Cung cấp các chức năng tự động hóa như quản lý các quan hệ và ánh xạ dữ liệu.
Hỗ trợ các tính năng như lazy loading và caching giúp tối ưu hóa việc tải dữ liệu.
Dễ bảo trì và mở rộng.
Nhược điểm:
Có thể làm tăng độ phức tạp cho các truy vấn đơn giản.
Trong một số trường hợp, hiệu suất thấp hơn JDBC do quá trình ánh xạ và các lớp trừu tượng bổ sung.
Cần thời gian học tập và hiểu sâu về cách thức ORM hoạt động.
JDBC (Java Database Connectivity):

Ưu điểm:
Truy vấn nhanh hơn vì bạn viết các câu lệnh SQL trực tiếp, không có overhead từ quá trình ánh xạ đối tượng.
Linh hoạt hơn, đặc biệt là khi thực hiện các truy vấn phức tạp và tối ưu hóa hiệu suất trực tiếp.
Nhược điểm:
Mất nhiều thời gian và công sức hơn để viết và bảo trì mã, đặc biệt trong các ứng dụng lớn.
Dễ bị lỗi và khó quản lý hơn khi ứng dụng phát triển.
Không có các tính năng tự động hóa quản lý quan hệ giữa các bảng, đòi hỏi lập trình viên phải tự quản lý các thao tác này.
Hiệu suất (Performance) ORM vs JDBC:
ORM có thể chậm hơn một chút so với JDBC trong một số tình huống do có thêm các lớp trừu tượng và quá trình ánh xạ dữ liệu giữa các đối tượng và bảng. ORM phải xử lý nhiều bước tự động hóa hơn, như kiểm tra phiên làm việc (session), cache và ánh xạ quan hệ, điều này có thể tạo ra overhead về thời gian xử lý.

JDBC lại có lợi thế về hiệu suất vì nó thực hiện các truy vấn SQL trực tiếp mà không phải thông qua quá trình ánh xạ phức tạp. Khi cần tối ưu hóa tối đa, JDBC có thể nhanh hơn, đặc biệt là trong các ứng dụng yêu cầu hiệu suất cao và các truy vấn rất phức tạp.

Tuy nhiên, trong hầu hết các ứng dụng, lợi ích về khả năng phát triển nhanh, dễ bảo trì và bảo mật của ORM thường quan trọng hơn một chút sự khác biệt về hiệu suất.
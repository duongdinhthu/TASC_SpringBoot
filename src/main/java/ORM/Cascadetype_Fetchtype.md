1. Cascade Type
   Cascade Type xác định hành động mà JPA sẽ thực hiện trên các entity liên quan (thực thể con) khi có một hành động xảy ra trên entity cha. Các loại cascade thường được sử dụng bao gồm:

CascadeType.ALL: Áp dụng tất cả các loại cascade (PERSIST, MERGE, REMOVE, REFRESH, DETACH).
CascadeType.PERSIST: Khi entity cha được lưu, các entity con cũng sẽ được lưu.
CascadeType.MERGE: Khi entity cha được cập nhật, các entity con cũng sẽ được cập nhật.
CascadeType.REMOVE: Khi entity cha bị xóa, các entity con cũng sẽ bị xóa.
CascadeType.REFRESH: Khi entity cha được làm mới, các entity con cũng sẽ được làm mới.
CascadeType.DETACH: Khi entity cha bị tách ra khỏi EntityManager, các entity con cũng sẽ bị tách ra.



2. Fetch Type
   Fetch Type xác định cách mà JPA sẽ lấy dữ liệu cho các entity liên quan khi truy vấn. Hai loại fetch type chính là:

FetchType.LAZY: Chỉ tải dữ liệu khi thực sự cần thiết. Điều này giúp tiết kiệm tài nguyên và tăng hiệu suất. Dữ liệu sẽ được tải khi bạn truy cập vào nó lần đầu tiên.
FetchType.EAGER: Tải toàn bộ dữ liệu ngay khi truy vấn entity cha. Điều này có thể dẫn đến việc tải nhiều dữ liệu không cần thiết và có thể làm chậm hiệu suất.



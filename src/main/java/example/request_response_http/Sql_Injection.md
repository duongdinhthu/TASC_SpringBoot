Bảo vệ chống lại SQL Injection
Đảm bảo rằng bạn luôn sử dụng các câu lệnh chuẩn bị sẵn (prepared statements) khi làm việc với cơ sở dữ liệu trong Java. Nếu bạn sử dụng JPA hoặc Hibernate, chúng tự động bảo vệ bạn khỏi SQL Injection.



@Repository
public class UserRepository {
@PersistenceContext
private EntityManager entityManager;

    public User findUserByUsername(String username) {
        String query = "SELECT u FROM User u WHERE u.username = :username";
        return entityManager.createQuery(query, User.class)
                .setParameter("username", username)
                .getSingleResult();
    }
}

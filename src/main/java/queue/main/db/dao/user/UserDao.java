package queue.main.db.dao.user;

public interface UserDao {
    void addUser(String login, String passwordHash, String role);
}

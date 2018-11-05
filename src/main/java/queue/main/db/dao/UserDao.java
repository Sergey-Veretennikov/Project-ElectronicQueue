package queue.main.db.dao;

public interface UserDao {
    void addUser(String login, String passwordHash, String role);
}

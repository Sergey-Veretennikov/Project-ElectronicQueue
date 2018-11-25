package queue.main.service.user;

public interface UserService {
    void addUser(String name, String surname, String dateofBirth, String contact, String login, String password,
                 String role, String isActive);
}

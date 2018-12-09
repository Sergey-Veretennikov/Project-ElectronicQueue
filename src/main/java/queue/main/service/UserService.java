package queue.main.service;

import queue.main.db.entities.Queue;
import queue.main.db.entities.Users;

public interface UserService {
    boolean addUser(String name, String surname, String dateofBirth, String contact, String login, String password,
                    String role, String isActive);

    Users getUser(Integer id);
    Users getUser(String login);
    Queue getQueue(Boolean done);
    void updateQueue(Queue queue);
    Integer add(Queue queue);
}

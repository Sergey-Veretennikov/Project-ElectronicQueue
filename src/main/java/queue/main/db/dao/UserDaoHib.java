package queue.main.db.dao;

import java.util.List;

public interface UserDaoHib {
    void create(Object user);
    void update(Object user);
    Object getById(Long userId, Class<?> t);
    List<Object> getAll(String s);
    void delete(Object user);
}

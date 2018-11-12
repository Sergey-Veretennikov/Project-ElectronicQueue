package queue.main.db.dao;

import java.util.List;

public interface UserDaoHib {
    Integer add(Object user);
    void update(Object user);
    Object getById(Integer userId, Class<?> t);
    List<Object> getAll(String s);
    void delete(Object user);
}

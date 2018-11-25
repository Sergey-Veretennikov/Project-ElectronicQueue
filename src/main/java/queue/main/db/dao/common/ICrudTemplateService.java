package queue.main.db.dao.common;

import java.util.List;

public interface ICrudTemplateService<T> {

    Integer add(T entity) ;
    void update(T entity);
    T getById(Integer entityId, Class<T> entityClass);
    List<T> getAll();
    void delete(T entity) ;
}

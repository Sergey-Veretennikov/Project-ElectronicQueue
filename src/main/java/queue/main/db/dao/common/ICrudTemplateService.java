package queue.main.db.dao.common;

import java.util.List;

public interface ICrudTemplateService<T> {

    Integer add(T entity) ;
    void update(T entity);
    T getById(Integer entityId);
    List<T> getAll();
    void delete(T entity) ;
    List<T> getByCriteria(String propName, String val);
}

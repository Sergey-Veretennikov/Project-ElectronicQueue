package queue.main.db.dao.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.transaction.Transactional;
import java.util.List;

public abstract class AbstractCrudTemplateService<T> implements  ICrudTemplateService<T>{

    @Autowired
    private SessionFactory sessionFactory;

    protected SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    protected Session getCurrentSession(){
        return getSessionFactory().getCurrentSession();
    }

    @Transactional
    public Integer add(T entity) {
        Integer id = (Integer) getCurrentSession().save(entity);
        return id;
    }

    @Transactional
    public void update(T entity) {
        getCurrentSession().update(entity);
    }

    @Transactional
    public T getById(Integer entityId, Class<T> entityClass) {
        T obj =  getCurrentSession().get(entityClass, entityId);
        return obj;
    }

    @Transactional
    public List<T> getAll() {
        List<T> list = getCurrentSession().createQuery("FROM " + getEntityTableName() + " order by ").list();
        return list;
    }

    @Transactional
    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    protected String getEntityTableName() throws NotImplementedException {
        throw new NotImplementedException();
    }


}

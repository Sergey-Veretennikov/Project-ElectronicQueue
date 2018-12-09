package queue.main.db.dao.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class AbstractCrudDaoHib<T> implements ICrudHibernateContainer<T> {

    private final Class<T> classOfEntity;
    @Autowired
    private SessionFactory sessionFactory;

    public AbstractCrudDaoHib(Class<T> classOfEntity) {
        this.classOfEntity = classOfEntity;
    }

    protected SessionFactory getSessionFactory() {

        return sessionFactory;
    }

    protected Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }


    public Integer add(T entity) {
        Integer id = (Integer) getCurrentSession().save(entity);
        return id;
    }


    public void update(T entity) {
        getCurrentSession().update(entity);
    }


    public T getById(Integer entityId) {
        T obj = getCurrentSession().get(classOfEntity, entityId);
        return obj;
    }


    public List<T> getAll() {
        List<T> list = getCurrentSession().createQuery("from " + getEntityTableName()).list();
        return list;
    }


    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    protected String getEntityTableName() throws NotImplementedException {
        throw new NotImplementedException();
    }


    public List<T> getByCriteria(String propName, Object val) {
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(classOfEntity);
        Root<T> likeRoot = criteriaQuery.from(classOfEntity);
        if (val.getClass().equals(String.class)){
            criteriaQuery.where(criteriaBuilder.like(likeRoot.get(propName), val.toString()));
        } else {
            criteriaQuery.where(criteriaBuilder.equal(likeRoot.get(propName), val));
        }
        return getCurrentSession().createQuery(criteriaQuery).getResultList();
    }


}

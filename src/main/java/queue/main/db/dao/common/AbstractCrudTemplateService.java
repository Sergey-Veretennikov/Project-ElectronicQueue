package queue.main.db.dao.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import queue.main.utils.GenericClass;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

public abstract class AbstractCrudTemplateService<T> implements  ICrudTemplateService<T>{

    private GenericClass<T> classOfEntity;

    public AbstractCrudTemplateService(Class<T> classOfEntity) {
        this.classOfEntity = new GenericClass(classOfEntity);
    }

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
    public T getById(Integer entityId) {
        T obj =  getCurrentSession().get(classOfEntity.getEntityType(),entityId);
        return obj;
    }

    @Transactional
    public List<T> getAll() {
        List<T> list = getCurrentSession().createQuery("from " + getEntityTableName()).list();
        return list;
    }

    @Transactional
    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    protected String getEntityTableName() throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Transactional
    public List<T> getByCriteria(String propName, String val){
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery= criteriaBuilder.createQuery(classOfEntity.getEntityType());
        Root<T> likeRoot = criteriaQuery.from(classOfEntity.getEntityType());
        criteriaQuery.where(criteriaBuilder.like(likeRoot.get(propName),val));
        return getCurrentSession().createQuery(criteriaQuery).getResultList();
    }

}

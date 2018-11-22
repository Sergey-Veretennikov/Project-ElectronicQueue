package queue.main.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import queue.main.db.entities.Users;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class UserDaoHibImpl implements UserDaoHib {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public Integer add(Object user) {
        sessionFactory.openSession();
        Integer id = (Integer) sessionFactory.getCurrentSession().save(user);
        return id;
    }

    @Override
    @Transactional
    public void update(Object user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    @Transactional
    public Object getById(Integer userId, Class<?> t) {
        Object obj =  sessionFactory.getCurrentSession().get(t, userId);
        return obj;
    }

    @Override
    @Transactional
    public List<Object> getAll(String s) {
        List<Object> list = sessionFactory.getCurrentSession().createQuery("FROM " + s + " order by ").list();
        return list;
    }

    @Override
    @Transactional
    public void delete(Object user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    @Transactional
    public void addUsers(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }
}
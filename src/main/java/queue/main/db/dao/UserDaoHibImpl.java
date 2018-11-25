package queue.main.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import queue.main.db.entities.Role;
import queue.main.db.entities.Users;

import javax.transaction.Transactional;
import java.util.ArrayList;
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
        Object obj = sessionFactory.getCurrentSession().get(t, userId);
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
    //@Transactional
    public void addUsers(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    // @Transactional
    public Role getRole(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return (Role) session.get(Role.class, id);
    }

    @Override
    public Users getUser(String login) {
        Session session = sessionFactory.getCurrentSession();
        List<Users> usersList = new ArrayList<>();
        usersList = session.createQuery("from Users where login=: login").setParameter("login", login).list();
        if (usersList.size() > 0) {
            return usersList.get(0);
        } else return null;
    }
}
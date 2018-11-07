package queue.main.db.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDaoHibImpl implements UserDaoHib {
    private static final Logger log = Logger.getLogger(UserDaoHibImpl.class);

    public static SessionFactory sessionFactory;
    public static Session session;


    public static void init() {
        log.debug("Init");
        sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
    }

    @Override
    public void create(Object user) {
        log.debug("Transaction create");
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }

    @Override
    public void update(Object user) {
        log.debug("Transaction update");
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
    }

    @Override
    public Object getById(Long userId, Class<?> t) {
        log.debug("Transaction getbyID");
        session.beginTransaction();
        Object obj = session.get(t, userId);
        session.getTransaction().commit();
        return obj;
    }

    @Override
    public List<Object> getAll(String s) {
        log.debug("Transaction get ListGetALL");
        session.beginTransaction();
        List<Object> list = session.createQuery("FROM " + s + " order by ").list();
        session.getTransaction().commit();
        return list;
    }

    @Override
    public void delete(Object user) {
        log.debug("Transaction delete");
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
    }
}

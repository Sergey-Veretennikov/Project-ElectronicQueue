package queue.main.db.dao;

import queue.main.db.pojo.Operator;

public class UserDaoHibTest {
    public static void main(String[] args) {

        Operator operator = new Operator("Name","Login","Password","Role",30,"Contact");
        UserDaoHibImpl.init();
        UserDaoHib userDaoHib = new UserDaoHibImpl();
        userDaoHib.create(operator);
//        Operator operator1 = (Operator)userDaoHib.getById((long) 1, Operator.class);
//        System.out.println(operator1.toString());
        UserDaoHibImpl.sessionFactory.close();


    }
}

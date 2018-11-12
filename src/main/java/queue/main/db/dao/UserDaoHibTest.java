package queue.main.db.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import queue.main.db.pojo.Window;

public class UserDaoHibTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springHibernate.xml");
        UserDaoHib userDaoHib = (UserDaoHib) context.getBean("userDao");
        Window window = new Window("window1");
        Integer ID = userDaoHib.add(window);
        Window window1 = (Window)userDaoHib.getById(ID,Window.class);
        System.out.println(window1.toString());
    }
}

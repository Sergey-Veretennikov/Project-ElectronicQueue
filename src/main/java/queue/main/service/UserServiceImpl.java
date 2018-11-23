package queue.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import queue.main.db.dao.UserDaoHib;
import queue.main.db.entities.Role;
import queue.main.db.entities.UserInfo;
import queue.main.db.entities.Users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    // private UserDao userDao;
    private UserDaoHib userDaoHib;

    @Autowired
    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

   /* @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Autowired
    public void setUserDaoHib(UserDaoHib userDaoHib) {
        this.userDaoHib = userDaoHib;
    }

    @Override
    public void addUser(String name, String surname, String dateofBirth, String contact, String login, String password,
                        String role, String isActive) {
        String cryptPassword = bCryptPasswordEncoder.encode(password);
        /*userDao.addUser(login, cryptPassword, role);*/

        Date parsed = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parsed = format.parse(dateofBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Users users = new Users(login, cryptPassword, isActive.equals("true"),
                new UserInfo(name, surname, parsed, contact), new Role(role));
        userDaoHib.addUsers(users);
    }
}

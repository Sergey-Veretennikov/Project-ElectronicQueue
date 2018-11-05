package queue.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import queue.main.db.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserDao userDao;

    @Autowired
    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(String login, String password, String role) {
        String cryptPassword = bCryptPasswordEncoder.encode(password);
        userDao.addUser(login, cryptPassword, role);
    }
}

package queue.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import queue.main.db.dao.UserDaoHib;
import queue.main.db.entities.UserInfo;
import queue.main.db.entities.Users;

import javax.transaction.Transactional;
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

    @Autowired
    public void setUserDaoHib(UserDaoHib userDaoHib) {
        this.userDaoHib = userDaoHib;
    }

    @Override
    @Transactional
    public boolean addUser(String name, String surname, String dateofBirth, String contact, String login, String password,
                           String idRole, String isActive) {
        String cryptPassword = bCryptPasswordEncoder.encode(password);

        Users users = userDaoHib.getUser(login);

        if (users == null) {
            users = new Users(login, cryptPassword, "true".equals(isActive)
                    , new UserInfo(name, surname, convertStringToDate(dateofBirth), contact)
                    , userDaoHib.getRole(Integer.valueOf(idRole)));
            userDaoHib.addUsers(users);
            return true;
        }
        return false;
    }

    private Date convertStringToDate(String stringDate) {
        Date parsed = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            parsed = format.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsed;
    }
}

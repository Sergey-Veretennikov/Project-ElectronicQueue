package queue.main.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import queue.main.db.dao.common.ICrudHibernateContainer;
import queue.main.db.entities.Role;
import queue.main.db.entities.UserInfo;
import queue.main.db.entities.Users;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    private ICrudHibernateContainer<Users> userDaoHib;
    private ICrudHibernateContainer<Role> roleDaoHib;

    @Autowired
    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Autowired
    @Qualifier("UserDaoHibImpl")
    public void setUserDaoHib(ICrudHibernateContainer<Users> userDaoHib) {
        this.userDaoHib = userDaoHib;
    }


    @Autowired
    @Qualifier("RoleDaoHibImpl")
    public void setRoleDaoHib(ICrudHibernateContainer<Role> roleDaoHib) {
        this.roleDaoHib = roleDaoHib;
    }


    @Override
    @Transactional
    public boolean addUser(String name, String surname, String dateofBirth, String contact, String login, String password,
                           String idRole, String isActive) {
        String cryptPassword = bCryptPasswordEncoder.encode(password);

        List<Users> users = userDaoHib.getByCriteria("login", login);

        if (users == null || users.size() == 0) {
            Users newUser = new Users(login, cryptPassword, "true".equals(isActive)
                    , new UserInfo(name, surname, convertStringToDate(dateofBirth), contact)
                    , roleDaoHib.getById(Integer.parseInt(idRole, 10)));
            userDaoHib.add(newUser);
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

    @Override
    @Transactional
    public Users getUser(Integer id) {
        return userDaoHib.getById(id);
    }

    @Override
    @Transactional
    public Users getUser(String login) {
        List<Users> result = userDaoHib.getByCriteria("login", login);
        if (result != null || result.size() > 0) {
            return result.get(0);
        }
        return null;
    }
}

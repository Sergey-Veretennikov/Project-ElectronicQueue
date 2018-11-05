package queue.main.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addUser(String login, String passwordHash, String role) {
        String addUserQuery = "insert into users (login_email, password, role_user) values (?,?,?)";
        jdbcTemplate.update(addUserQuery, login, passwordHash, role);
    }
}

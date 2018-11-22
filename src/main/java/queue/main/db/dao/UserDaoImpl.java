package queue.main.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

//@Repository
public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addUser(String login, String passwordHash, String role) {
        String addUserQuery = "insert into users (login, password, is_active, user_info_id) values (?,?,true ,1)";
        String addRoleQuery = "INSERT INTO role ( role_name ) VALUES (?)";
        jdbcTemplate.update(addUserQuery, login, passwordHash);
        jdbcTemplate.update(addRoleQuery, role);
    }
}

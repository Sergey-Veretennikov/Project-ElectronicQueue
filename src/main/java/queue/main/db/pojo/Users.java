package queue.main.db.pojo;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usersID")
    private Integer user_id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "isActive")
    private Boolean isActive;
    @Column(name = "userInfoID")
    private Integer userInfoID;

    public Users() {
    }

    public Users(String login, String password, Boolean isActive, Integer userInfoID) {
        this.login = login;
        this.password = password;
        this.isActive = isActive;
        this.userInfoID = userInfoID;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getUserInfoID() {
        return userInfoID;
    }

    public void setUserInfoID(Integer userInfoID) {
        this.userInfoID = userInfoID;
    }
}

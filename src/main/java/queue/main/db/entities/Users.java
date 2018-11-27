package queue.main.db.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usersID")
    private Integer userID;
    @Basic
    private String login;
    @Basic
    private String password;
    @Basic
    private Boolean isActive;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userInfoID")
    private UserInfo userInfo;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "usersRole",
            joinColumns = @JoinColumn (name ="usersID"),
            inverseJoinColumns = @JoinColumn(name = "roleID"))
    private List<Role> roles = new ArrayList<>();
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Queue queue;

    public Users() {
    }

    public Users(String login, String password, Boolean isActive) {
        this.login = login;
        this.password = password;
        this.isActive = isActive;
    }

    public Integer getUserID() {
        return userID;
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

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Queue getQueue() {
        return queue;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", userInfo=" + userInfo +
                ", roles=" + roles +
                ", queue=" + queue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(userID, users.userID) &&
                Objects.equals(login, users.login) &&
                Objects.equals(password, users.password) &&
                Objects.equals(isActive, users.isActive) &&
                Objects.equals(userInfo, users.userInfo) &&
                Objects.equals(roles, users.roles) &&
                Objects.equals(queue, users.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, login, password, isActive, userInfo, roles, queue);
    }

}

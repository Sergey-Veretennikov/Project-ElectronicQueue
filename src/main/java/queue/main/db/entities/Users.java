package queue.main.db.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id", unique = true, nullable = false)
    private Integer userID;

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "password", unique = true, nullable = false)
    private String password;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinTable(name = "users_role",
            joinColumns = @JoinColumn(name = "users_id", nullable = false, updatable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false, updatable = false))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private Set<Queue> queues = new HashSet<>();

    public Users() {
    }

    public Users(String login, String password, Boolean isActive, UserInfo userInfo, Role role) {
        this.login = login;
        this.password = password;
        this.isActive = isActive;
        this.userInfo = userInfo;
        this.roles.add(role);
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Queue> getQueue() {
        return queues;
    }

    public void setQueue(Set<Queue> queue) {
        this.queues = queues;
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
                ", queue=" + queues +
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
                Objects.equals(queues, users.queues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, login, password, isActive, userInfo, roles, queues);
    }
}

package queue.main.db.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table (name = "administrator")
public class Administrator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "administrator_id")
    private Long administrator_id;
    @Column(name = "name_administrator")
    private String name_administrator;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;
    @Column(name = "age")
    private Integer age;
    @Column(name = "contact")
    private String contact;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "administrator")
    private List<Operator> operators;

    public Administrator() {
    }

    public Administrator(String name_administrator, String login, String password, String role, Integer age, String contact) {
        this.name_administrator = name_administrator;
        this.login = login;
        this.password = password;
        this.role = role;
        this.age = age;
        this.contact = contact;
    }

    public Long getAdministrator_id() {
        return administrator_id;
    }

    public void setAdministrator_id(Long administrator_id) {
        this.administrator_id = administrator_id;
    }

    public String getName_administrator() {
        return name_administrator;
    }

    public void setName_administrator(String name_administrator) {
        this.name_administrator = name_administrator;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "administrator_id=" + administrator_id +
                ", name_administrator='" + name_administrator + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", operators=" + operators +
                '}';
    }
}
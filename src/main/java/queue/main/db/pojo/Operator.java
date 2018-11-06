package queue.main.db.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "operator")
public class Operator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operator_id")
    private Long operator_id;
    @Column(name = "name_operator")
    private String name_operator;
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

    public Operator() {
    }


    public Operator(String name_operator, String login, String password, String role, Integer age, String contact) {
        this.name_operator = name_operator;
        this.login = login;
        this.password = password;
        this.role = role;
        this.age = age;
        this.contact = contact;
    }

    public Long getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(Long operator_id) {
        this.operator_id = operator_id;
    }

    public String getName_operator() {
        return name_operator;
    }

    public void setName_operator(String name_operator) {
        this.name_operator = name_operator;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operator_id=" + operator_id +
                ", name_operator='" + name_operator + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                '}';
    }
}

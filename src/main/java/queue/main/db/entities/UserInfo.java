package queue.main.db.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userInfoID")
    private Integer userInfoID;
    @Basic
    private String name;
    @Basic
    private String surname;
    @Basic
    private Timestamp dateofBirth;
    @Basic
    private String contact;

    public UserInfo() {
    }

    public UserInfo(String name, String surname, Timestamp dateofBirth, String contact) {
        this.name = name;
        this.surname = surname;
        this.dateofBirth = dateofBirth;
        this.contact = contact;
    }

    public Integer getUserInfoID() {
        return userInfoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Timestamp getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Timestamp dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(userInfoID, userInfo.userInfoID) &&
                Objects.equals(name, userInfo.name) &&
                Objects.equals(surname, userInfo.surname) &&
                Objects.equals(dateofBirth, userInfo.dateofBirth) &&
                Objects.equals(contact, userInfo.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInfoID, name, surname, dateofBirth, contact);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoID=" + userInfoID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateofBirth=" + dateofBirth +
                ", contact='" + contact + '\'' +
                '}';
    }
}

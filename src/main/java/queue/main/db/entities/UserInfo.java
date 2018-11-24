package queue.main.db.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id", unique = true, nullable = false)
    private Integer userInfoID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "dateof_birth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateofBirth;

    @Column(name = "contact", nullable = false)
    private String contact;

    public UserInfo() {
    }

    public UserInfo(String name, String surname, Date dateofBirth, String contact) {
        this.name = name;
        this.surname = surname;
        this.dateofBirth = dateofBirth;
        this.contact = contact;
    }

    public Integer getUserInfoID() {
        return userInfoID;
    }

    public void setUserInfoID(Integer userInfoID) {
        this.userInfoID = userInfoID;
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

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
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

package queue.main.db.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleID")
    private Integer roleID;
    @Basic
    private String roleName;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "usersRole",
            joinColumns = @JoinColumn (name ="roleID"),
            inverseJoinColumns = @JoinColumn(name = "usersID"))
    private List<Users> users = new ArrayList<>();
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "RolePermission",
            joinColumns = @JoinColumn (name ="roleID"),
            inverseJoinColumns = @JoinColumn(name = "permissionID"))
    private List<Permission> permissions = new ArrayList<>();

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Integer getWindowID() {
        return roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Users> getUsers() {
        return users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                ", users=" + users +
                ", permissions=" + permissions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleID, role.roleID) &&
                Objects.equals(roleName, role.roleName) &&
                Objects.equals(users, role.users) &&
                Objects.equals(permissions, role.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleID, roleName, users, permissions);
    }

}

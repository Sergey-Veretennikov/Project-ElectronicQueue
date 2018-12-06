package queue.main.db.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private Integer permissionID;
    @Column(name = "permission_name")
    private String permissionName;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "role_permission",
            joinColumns = @JoinColumn(name = "permission_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles = new ArrayList<>();
    /*@ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Service service;*/

    public Permission() {
    }

    public Permission(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getPermissionID() {
        return permissionID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionID=" + permissionID +
                ", permissionName='" + permissionName + '\'' +
                ", roles=" + roles +
                //", service=" + service +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return Objects.equals(permissionID, that.permissionID) &&
                Objects.equals(permissionName, that.permissionName) &&
                Objects.equals(roles, that.roles);// &&
                //Objects.equals(service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionID, permissionName, roles/*, service*/);
    }
}

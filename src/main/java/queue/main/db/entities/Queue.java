package queue.main.db.entities;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Queue{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "queueID")
    private Integer queueID;
    @OneToMany(mappedBy = "queue")
    private List<Users> users;
    @OneToMany(mappedBy = "queue")
    private List<Window> windows;
    @OneToMany(mappedBy = "queue")
    private List<Service> services;

    public Queue() {
    }

    public Integer getQueueID() {
        return queueID;
    }

    public List<Users> getUsers() {
        return users;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public List<Service> getServices() {
        return services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return Objects.equals(queueID, queue.queueID) &&
                Objects.equals(users, queue.users) &&
                Objects.equals(windows, queue.windows) &&
                Objects.equals(services, queue.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueID, users, windows, services);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queueID=" + queueID +
                ", users=" + users +
                ", windows=" + windows +
                ", services=" + services +
                '}';
    }

}

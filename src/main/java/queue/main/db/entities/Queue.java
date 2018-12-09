package queue.main.db.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "queue")
public class Queue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "queue_id")
    private Integer queueID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_operator_id", unique = true, nullable = false)
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "window_id", unique = true, nullable = false)
    private Window window;

    @OneToMany(mappedBy = "queue", fetch = FetchType.LAZY)
    private List<Service> services;

    @Column(name = "done")
    private Boolean done;

    public Queue() {
    }

    public Queue(Users users) {
        this.users = users;
    }

    public Integer getQueueID() {
        return queueID;
    }

    public void setQueueID(Integer queueID) {
        this.queueID = queueID;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public List<Service> getServices() {
        return services;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }


}

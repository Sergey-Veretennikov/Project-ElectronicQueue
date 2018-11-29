package queue.main.db.entities;


import javax.persistence.*;

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

    /* @OneToMany(mappedBy = "queue")
     private List<Users> users;*/
/*
    @OneToMany(mappedBy = "queue")
    private List<Service> services;*/


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

    /*   public List<Users> getUsers() {
        return users;
    }*/

 /*   public List<Window> getWindows() {
        return windows;
    }

    public List<Service> getServices() {
        return services;
    }*/

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return Objects.equals(queueID, queue.queueID) &&
                Objects.equals(users, queue.users) &&
                Objects.equals(windows, queue.windows) &&
                Objects.equals(services, queue.services);
    }*/

 /*   @Override
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
    }*/

}

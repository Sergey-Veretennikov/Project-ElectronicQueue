package queue.main.db.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Integer serviceID;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "average_lead_time")
    private Integer averageLeadTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "queue_id", unique = true, nullable = false)
    private Queue queue;
    @OneToMany(mappedBy = "service")
    private List<Permission> permissions;


    public Service() {
    }

    public Service(String serviceName, Integer averageLeadTime, Queue queue) {
        this.serviceName = serviceName;
        this.averageLeadTime = averageLeadTime;
        this.queue = queue;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getAverageLeadTime() {
        return averageLeadTime;
    }

    public void setAverageLeadTime(Integer averageLeadTime) {
        this.averageLeadTime = averageLeadTime;
    }

    public Queue getQueue() {
        return queue;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                ", averageLeadTime=" + averageLeadTime +
                ", queue=" + queue +
                ", permissions=" + permissions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceID, service.serviceID) &&
                Objects.equals(serviceName, service.serviceName) &&
                Objects.equals(averageLeadTime, service.averageLeadTime) &&
                Objects.equals(queue, service.queue) &&
                Objects.equals(permissions, service.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceID, serviceName, averageLeadTime, queue, permissions);
    }

}

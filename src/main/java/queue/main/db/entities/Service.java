package queue.main.db.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

//@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Integer serviceID;
    @Basic
    private String serviceName;
    @Basic
    private Integer averageLeadTime;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
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

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public List<Permission> getPermissions() {
        return permissions;
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

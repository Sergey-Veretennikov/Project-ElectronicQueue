package queue.main.db.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Integer serviceID;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "average_lead_time")
    private Integer averageLeadTime;

    @OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
    private Set<Queue> queue = new HashSet<>();

    @OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
    private List<Permission> permissions;

    public Service() {
    }

    public Service(String serviceName, Integer averageLeadTime) {
        this.serviceName = serviceName;
        this.averageLeadTime = averageLeadTime;
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

    public Set<Queue> getQueue() {
        return queue;
    }

    public void setQueue(Set<Queue> queue) {
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

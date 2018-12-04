package queue.main.db.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "windows")
public class Window implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "window_id")
    private Integer windowID;

    @Column(name = "name")
    private String name;

    @Column(name = "work")
    private Boolean work;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private Set<Queue> queues = new HashSet<>();

    public Window() {
    }

    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWindowID() {
        return windowID;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Window{" +
                "windowID=" + windowID +
                ", name='" + name + '\'' +
                ", work=" + work +
                ", queues=" + queues +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(windowID, window.windowID) &&
                Objects.equals(name, window.name) &&
                Objects.equals(work, window.work) &&
                Objects.equals(queues, window.queues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(windowID, name, work, queues);
    }
}

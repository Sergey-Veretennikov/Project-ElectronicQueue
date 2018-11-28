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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(windowID, window.windowID) &&
                Objects.equals(name, window.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(windowID, name);
    }

    @Override
    public String toString() {
        return "Windows{" +
                "windowsID=" + windowID +
                ", name='" + name + '\'' +
                '}';
    }
}

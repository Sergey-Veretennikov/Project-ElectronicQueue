package queue.main.db.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "window")
public class Window implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "windowID")
    private Integer windowID;
    @Column(name = "name")
    private String name;

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
        return "Window{" +
                "windowID=" + windowID +
                ", name='" + name + '\'' +
                '}';
    }
}

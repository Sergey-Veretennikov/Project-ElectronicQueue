package queue.main.utils;

public class GenericClass<T> {
    private final Class<T> type;

    public GenericClass(Class<T> type) {
        this.type = type;
    }

    public Class<T> getEntityType() {
        return this.type;
    }
}

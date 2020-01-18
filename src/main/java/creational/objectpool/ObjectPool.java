package creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectPool<T> {

    private List<T> pool = new ArrayList<T>();
    private int maxPoolSize;

    public ObjectPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        init();
    }

    protected abstract T create();

    private void init() {
        for (int i = 0; i < maxPoolSize; i++) {
            pool.add(create());
        }
    }

    public T get() {
        T instance = pool.iterator().next();
        pool.remove(instance);
        return instance;
    }

    public void release(T instance) {
        pool.add(instance);
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }
}

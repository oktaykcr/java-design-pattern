package behavioral.iterator;

import java.util.List;

public class IteratorImpl<T> implements Iterator<T> {

    private final List<T> list;
    private int index;

    public IteratorImpl(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public Boolean hasNext() {
        return index <= list.size() - 1;
    }

    @Override
    public T next() {
        if(hasNext()) {
            return list.get(index++);
        }
        return null;
    }
}

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class HashSetUsingHashMap<E> extends AbstractSet<E> {

    private static final Object TEST = new Object();
    private Map<E, Object> map;

    public HashSetUsingHashMap() {

        map = new HashMap<>();
    }

    @Override
    public Iterator<E> iterator() {

        return map.keySet().iterator();
    }

    @Override
    public int size() {

        return map.size();
    }

    @Override
    public boolean contains(Object x) {
        return map.containsKey(x);
    }

    @Override
    public boolean add(E x) {
        return map.put(x, TEST) == null;
    }

    @Override
    public boolean remove(Object x) {

        return map.remove(x) != null;
    }

}

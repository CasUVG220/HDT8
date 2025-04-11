// VectorHeap.java
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> {
    private Vector<E> data;

    public VectorHeap() {
        data = new Vector<>();
    }

    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    public E remove() {
        if (data.isEmpty()) return null;
        E minVal = data.get(0);
        if (data.size() == 1) {
            data.remove(0);
        } else {
            data.set(0, data.remove(data.size() - 1));
            percolateDown(0);
        }
        return minVal;
    }
    

    public E peek() {
        return data.isEmpty() ? null : data.get(0);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    private void percolateUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            E val = data.get(idx);
            if (val.compareTo(data.get(parent)) >= 0) break;
            data.set(idx, data.get(parent));
            data.set(parent, val);
            idx = parent;
        }
    }

    private void percolateDown(int idx) {
        int child;
        E val = data.get(idx);
        while (idx * 2 + 1 < data.size()) {
            child = idx * 2 + 1;
            if (child + 1 < data.size() &&
                data.get(child + 1).compareTo(data.get(child)) < 0) {
                child++;
            }
            if (data.get(child).compareTo(val) >= 0) break;
            data.set(idx, data.get(child));
            idx = child;
        }
        data.set(idx, val);
    }

    public void printAll() {
        for (E e : data) {
            System.out.println(e);
        }
    }
}

import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> {
    protected ArrayList<E> data;

    public VectorHeap() {
        data = new ArrayList<>();
    }

    // Agregar elemento al heap
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    // Remover el elemento con mayor prioridad (raíz del heap)
    public E remove() {
        if (data.isEmpty()) return null;
        E minVal = data.get(0);
        E last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {
            data.set(0, last);
            percolateDown(0);
        }
        return minVal;
    }

    // Revisar el siguiente en prioridad
    public E peek() {
        return data.isEmpty() ? null : data.get(

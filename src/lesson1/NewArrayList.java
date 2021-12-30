package lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewArrayList<T extends Comparable<T>> implements MyList<T> {

    private static final int DEFAULT_SIZE = 10;
    static int size = 0;
    private T[] elements;

    public NewArrayList(Class<T> c) {
        elements = (T[]) Array.newInstance(c, DEFAULT_SIZE);
    }

    public int length() {
        return elements.length;
    }

    public void add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (int) (elements.length * 1.5));
        }
        elements[size++] = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            return;
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        elements[size] = null;
    }

    public T get(int i) {
        if (i >= 0 && i <= size) {
            return elements[i];
        }
        return (T) "No such element";
    }

    public void set(int i, T t) {
        elements[i] = t;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
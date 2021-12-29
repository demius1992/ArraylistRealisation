package lesson1;

import java.util.Arrays;

public class NewArrayList<T extends Comparable<T>> implements MyList<T> {

    private static final int DEFAULT_SIZE = 10;
    static int size = 0;
    private String[] elements = new String[DEFAULT_SIZE];

    public void add(String string) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = string;
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

    public String get(int i) {
        if (i > 0 && i < size) {
            return elements[i];
        }
        return "-1";
    }

    public void set(int i, String string) {
        elements[i] = string;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
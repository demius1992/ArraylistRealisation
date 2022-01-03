package lesson1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class NewArrayList<T extends Comparable<T>> implements MyList<T> {

    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private T[] elements;

    //метод проверяет тип Т, если число - возвращает 1, если нет - возвращает 2.
    public int check() {
        int result;
        for (T element : elements) {
            if (element instanceof Number) {
                result = 1;
            } else {
                result = 2;
            }
            return result;
        }
        return 0;
    }

    public void sort() {
        int a = check();
        switch (a) {
            case (1): {
                boolean isSorted = false;
                T buf;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < elements.length - 1; i++) {
                        if (elements[i] == null || elements[i + 1] == null) {
                            break;
                        }
                        if (Float.parseFloat(String.valueOf(elements[i])) > Float.parseFloat(String.valueOf(elements[i + 1]))) {
                            isSorted = false;
                            buf = elements[i];
                            elements[i] = elements[i + 1];
                            elements[i + 1] = buf;
                        }
                    }
                }
                break;
            }
            case (2): {
                Arrays.sort(elements, Comparator.nullsLast(Comparator.comparing(Objects::toString)));
                break;
            }
            default:
                System.out.println("Something is going wrong...");
        }
    }

    public NewArrayList(Class<T> c) {
        elements = (T[]) Array.newInstance(c, DEFAULT_SIZE);
    }

    public void add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (int) (elements.length * 1.5));
        }
        elements[size] = t;
        size++;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            return;
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        elements[size] = null;
    }

    // метод get возвращает значение элемента по индексу, если таковой имеется, иначе возвращает null и говорит об ошибке
    public T get(int i) {
        try {
            return elements[i];
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.err.println("Array index out of bounds");
            return null;
        }
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

    // данный toString убирает элементы null при выводе на экран
    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s = s + elements[i].toString();
            if (i + 1 < size) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
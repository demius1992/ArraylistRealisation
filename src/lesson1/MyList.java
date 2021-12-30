package lesson1;

public interface MyList<T extends Comparable<T>> {

    void add(T t);

    void remove(int index);

    T get(int index);

    void set(int index, T t);

    int size();

    boolean isEmpty();

    int length();

    public void sort();
}
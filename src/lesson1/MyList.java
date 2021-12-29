package lesson1;

public interface MyList<T extends Comparable<T>> {

    void remove(int index);

    String get(int index);

    void set(int index, String string);

    int size();

    boolean isEmpty();
}
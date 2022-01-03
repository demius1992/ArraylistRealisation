package lesson1;

public class Cat implements Comparable<Cat> {
    private String name;
    private int weight;

    public Cat(int weight, String name) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}

package lesson1;

import lesson1.NewArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) throws Exception {
        /*
        При создании объекта класса NewArrayList в конструктор нужно передавать тип данных,
        которым объект параметризован .class
        Например:
        NewArrayList<Integer> array = new NewArrayList<>(Integer.class);
        NewArrayList<String> array = new NewArrayList<>(String.class);
         */
        NewArrayList<Cat> list = new NewArrayList<>(Cat.class);

        list.add(new Cat(570, "kitty"));
        list.add(new Cat(99999, "kot"));
        list.add(new Cat(300, "kat"));
        System.out.println(list);
        list.sort();
        System.out.println(list);


        NewArrayList<Integer> array = new NewArrayList(Integer.class);

        System.out.println("Количество значений в массиве: " + array.size());
        // Заполняем массив элементами

        for (int i = 15; i >= 0; i--) {
            array.add((int) (Math.random() * 100));
        }

        System.out.println(array);
        array.sort();
        System.out.println(array);

        System.out.println("Новое количество значений в массиве: " + array.size());

        array.set(4, 125);
        System.out.printf("Значения массива после замены элемента %d на элемент %d : \n %s \n", 4, 125, array);

        // создаем целое рандомное значение индекса для вызова метода get. В случае, если такого индекса нет,
        // то будет обработана ошибка и вернется значение null
        int k = (int) (Math.random() * (array.size() + 10) - 7);
        System.out.printf("Значение по индексу %d: %s \n", k, array.get(k));

        System.out.println("Проверка на наличие элементов в массиве: " + array.isEmpty());

        array.remove(10);
        System.out.println("Массив после удаления элемента по индексу 10: " + array);


        NewArrayList<String> array2 = new NewArrayList<>(String.class);

        System.out.println("Количество значений в массиве: " + array2.size());

        for (int i = 15; i >= 0; i--) {
            array2.add("str" + i);
        }
        System.out.println(array2);
        array2.sort();
        System.out.println(array2);
        System.out.println("Новое количество значений в массиве: " + array2.size());

        array2.set(4, "125");
        System.out.printf("Значения массива после замены элемента %d на элемент %d : \n %s \n", 4, 125, array2);
        System.out.printf("Значение по индексу %s: %s \n", array2.get(0), array2.get(0));
        System.out.println("Проверка на наличие элементов в массиве: " + array2.isEmpty());
        array2.remove(10);
        System.out.println("Массив после удаления элемента по индексу 10: " + array2);
    }
}
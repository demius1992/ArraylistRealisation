package lesson1;

public class Test {
    public static void main(String[] args) {
        /*
        При создании объеката класса NewArrayList в конструктор нужно передавать тип данных,
        которым объект параметризован .class
        Например:
        NewArrayList<Integer> array = new NewArrayList<>(Integer.class);
        NewArrayList<String> array = new NewArrayList<>(String.class);
         */


//        NewArrayList<Integer> array = new NewArrayList<>(Integer.class);
//
//        System.out.println("Количество значений в массиве: " + array.size());
//        System.out.println("Длина массива: " + array.length());
//        for (int i = 0; i < 15; i++) {
//            array.add(i);
//        }
//        System.out.println("Длина массива после добавления 15 элементов: " + array.length());
//        System.out.println("Новое количество значений в массиве: " + array.size());
//        System.out.println("Значения массива:" + array);
//        array.set(4, 125);
//        System.out.printf("Значения массива после замены элемента %d на элемент %d : \n %s \n", 4, 125, array);
//        System.out.printf("Значение по индексу %d: %s \n", array.get(0), array.get(0));
//        System.out.println("Проверка на наличие элементов в массиве: " + array.isEmpty());
//        array.remove(10);
//        System.out.println("Массив после удаления элемента по индексу 10: " + array);


        NewArrayList<String> array2 = new NewArrayList<>(String.class);

        System.out.println("Количество значений в массиве: " + array2.size());
        System.out.println("Длина массива: " + array2.length());
        for (int i = 0; i < 15; i++) {
            array2.add("qwerty" + String.valueOf(i));
        }
        System.out.println("Длина массива после добавления 15 элементов: " + array2.length());
        System.out.println("Новое количество значений в массиве: " + array2.size());
        System.out.println("Значения массива:" + array2);
        array2.set(4, "125");
        System.out.printf("Значения массива после замены элемента %d на элемент %d : \n %s \n", 4, 125, array2);
        System.out.printf("Значение по индексу %s: %s \n", array2.get(0), array2.get(0));
        System.out.println("Проверка на наличие элементов в массиве: " + array2.isEmpty());
        array2.remove(10);
        System.out.println("Массив после удаления элемента по индексу 10: " + array2);
    }
}

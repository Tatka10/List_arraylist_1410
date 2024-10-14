//Создать ArrayList с типом String, добавить в него имена,
// вывести длину этого ArrayList, удалить элемент с индексом 0,
// заменить элемент с индексом 1 на другой, получить элемент по индексу 2, отсортировать.

import java.util.ArrayList;
import java.util.Collections;

public class Exc1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ромашка");
        arr.add("Роза");
        arr.add("Тюльпан");
        arr.add("Мак");
        System.out.println(arr.size()); //длина массива
        arr.remove(0);
        System.out.println(arr); // удаление элемента
        arr.set(1, "Заменила на Гиацинт"); //замента элемента
        System.out.println(arr);
        System.out.println(arr.get(2)); // получение элемента по индексу
        Collections.sort(arr);
        System.out.println(arr); //сортировка
    }
}

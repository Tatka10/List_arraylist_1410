import java.util.ArrayList;

public class Exc3 {
    public static void main(String[] args) {
        //оздать ArrayList с типом String, добавить в него имена.
        // Написать метод, который примет на вход ArrayList и строку,
        // проверить, есть ли такая строка в ArrayList, и вернет ответ "да" или "нет".
        ArrayList<String> arr = new ArrayList<>();
        metod(arr);


    }

    public static void metod(ArrayList arr) {
        arr.add("Корова");
        arr.add("Коза");
        arr.add("Конь");
        arr.add("Кура");
        arr.add("Кошка");
        boolean a = arr.contains("Конь");
        System.out.println("Такой элемент есть "+a);
        boolean b= arr.contains( "Кот");
        System.out.println("Такой элемент есть "+b);
    }
}

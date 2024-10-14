import java.util.ArrayList;

public class Exc {
    public static void main(String[] args) {
        //Написать метод, который принимает в качестве параметров два ArrayList'а,
        // объединяет их в один и выводит результат на консоль.
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        assocArray(arr, arr1);
    }

    public static void assocArray(ArrayList arr, ArrayList arr1) {
        arr.add("Маша");
        arr.add("Глаша");
        arr.add("Настя");
        arr1.add("Паша");
        arr1.add("Коля");
        arr1.add("Алексей");
        arr.addAll(arr1);
        System.out.println(arr);
    }
}

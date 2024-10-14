import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("Dasha");
        list.add(0,"Pasha");
        System.out.println(list);
        list.set(0, "Sasha"); //замена элемента
        Collections.sort(list); //сортировка элементов массива

       // list.clear();
        System.out.println(list);
        }
    }


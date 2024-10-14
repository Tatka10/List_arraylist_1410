import java.util.ArrayList;

//Создать ArrayList<Integer>, в цикле заполнить его числами от 0 до 7.
public class Exc4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(7);
        getNUms(arr);

    }

    public static void getNUms(ArrayList arr) {
        for (int i = 0; i < 7; i++) {
            arr.add(i, i);
        }
        System.out.println(arr);

    }
}

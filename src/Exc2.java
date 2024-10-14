import java.util.ArrayList;

public class Exc2 {
    public static void main(String[] args) {
        //Создать ArrayList с типом Integer,
        // добавить в него числа, просуммировать эти числа в цикле, ответ вывести в консоль.
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(8);
        int sum=0;
        for (int i = 0; i < arr.size(); i++) {
            sum = arr.get(i)+sum; // просуммировать числа в цикле
        }
        System.out.println(sum);


    }
}


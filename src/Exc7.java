//7. Создать интерфейс Runnable с методом run() без реализации.
// Создать классы Cat и Dog, имплементирующие этот интерфейс.
// Реализация метода в разных классах должна немного отличаться.
// В классах должно быть поле name и конструктор.
//В методе main создать ArrayList с типом Runnable,
// добавить в него кошек и собак с разными именами, затем в цикле проверить,
// что все кошки и собаки умеют бегать.

import java.util.ArrayList;

public class Exc7 {
    public static void main(String[] args) {
        ArrayList<Runnable> arr = new ArrayList<>();
       arr.add(new Cat("Вася"));
        arr.add(new Dog("Бульдог"));
       arr.add(new Cat("Мурка"));
        arr.add(new Dog("Жорик"));
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            arr.get(i).run();

        }
    }
}

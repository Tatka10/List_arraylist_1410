public class Dog implements Runnable {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Пес %s носится как угорелый",name);

    }
}

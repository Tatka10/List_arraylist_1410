public class Cat implements Runnable {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Котик " +name+" потягивается и  грациозно бежит");
    }
}

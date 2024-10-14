import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        //Создать текстовый файл, записать в него несколько слов (руками).
        // Написать программу, которая считает эти слова из файла,
        // сохранит их в ArrayList, переведет в верхний регистр и выведет в консоль.
        metodNewFile();
        readFile("notes.txt");
        ArrayList <String> arr = new ArrayList<>();
        arr.addAll(readFile("notes.txt"));
        upperArr(arr);
        //System.out.println(arr);



    }

    public static Object metodNewFile() {
        File newFile = new File("notes.txt");

        try {
            boolean creates = newFile.createNewFile();
            if (creates) {
                System.out.println("Файл создан");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        return newFile;
    }

    public static ArrayList<String> readFile(String file) {
        ArrayList<String> arr = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(file));
            for (int i = 0; i < 5; i++) {
                arr.add(sc.next());
            }
            //System.out.println(arr);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return arr;
    }


    public static void upperArr(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).toUpperCase() + " ");
        }
    }

}



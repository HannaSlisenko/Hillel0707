package lessons.lesson14.exceptions;

import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        writeSomething("bla");
    }

    public static void writeSomething(String str) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            FileWriter fileWriter2 = new FileWriter("text.txt");
            fileWriter.write(str);
            fileWriter.close();
            System.out.println("работа программы в рамках блока try");
            fileWriter2.close();
        } catch (IOException e) {
            System.out.println("Поток зарыт. Запись невозможна");
        } finally {
            System.out.println("Учите теорию");
        }
        System.out.println("работа программы за блоком try catch");
    }
}
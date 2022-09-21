package lessons.lesson14.exceptions;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        System.out.println("ведите число: ");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        int[] a = {3, 4, 6};

        try {
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException i) {
            System.out.println("Что-то пошло не так");

        }

        System.out.println("Программа продолжает свою работу");
    }
}



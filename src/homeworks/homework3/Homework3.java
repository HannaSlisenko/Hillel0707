package homeworks.homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        System.out.println("Введите число 1");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = 1;

        if (number1 == number2) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");

        }
    }
}



package lessons.lesson6;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        String text = "Hello i am Maks";

        if (text.equals("Hello i am Maks")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }


        String text2 = "Hello i am Alex";
        System.out.println(text2.indexOf("l"));
        System.out.println(text2.lastIndexOf("l"));

        int num = 1256341;
        String temp = String.valueOf(num);
        System.out.println(temp);

        String num2 = "485634";
        int temp2 = Integer.parseInt(num2);
        System.out.println(temp2);

        double num3 = 5.49;

        System.out.println(Math.round(num3));
        System.out.println(Math.floor(num3));
        System.out.println(Math.ceil(num3));

        String[] myArr = {"Привет", "меня", "зовут", "Макс"};
        reverseArray(myArr);

        countWords();
    }

    public static void reverseArray(String[] arr) {
        int lengthArr = arr.length;
        String temp;

        for (int i = 0; i < lengthArr / 2; i++) {
            temp = arr[lengthArr - i - 1];
            arr[lengthArr - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (String a : arr) {
            System.out.print(a + " ");
        }

    }

    public static void countWords() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку в консоль");

        String input = scanner.nextLine();

        int count = 0;

        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

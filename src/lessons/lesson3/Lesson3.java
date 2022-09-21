package lessons.lesson3;

import static java.lang.Math.max;

public class Lesson3 {
    public static void main(String[] args) {
//        int a = 8;
//        System.out.println(Math.sqrt(a));
//
//        int b = 8;
//        int i = 16;
//        System.out.println(max(b, i));
//
//
//        System.out.println("Введите любое целое число от 1 до 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int result = number + 2;
//        System.out.println("Вы ввели число: " + result);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите два целых числа: ");
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        System.out.println(number1 + number2);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите фразу: ");
//        String phrase = scanner.nextLine();
//        String phrase2 = scanner.nextLine();
//        System.out.println(phrase + phrase2);
//
//        System.out.println("Введите любое целое число от 1 до 10: ");
//        Scanner scanner = new Scanner();
//        int number = scanner.nextInt();
//
//        System.out.println("Введите любой текст: ");
//        Scanner scannerText = new Scanner();
//        String text = scannerText.nextLine();
//
//        System.out.println(text + " " + number);
//
//        byte a = 15;
//        int b = a;
//        System.out.println(b);
//
//        int number1 = 6;
//        int number2 = 6;
//
//        if (number1 != number2) {
//            System.out.println("Первое число равняется второму");
//        } else {
//            System.out.println("Первое число не равняется второму");
//        }
//    }
        int number1 = 6;
        int number2 = 9;

        if (number1 > number2) {
            System.out.println("Первое число больше второго");
        } else if (number1 < number2) {
            System.out.println("первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }

}

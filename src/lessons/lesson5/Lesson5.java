package lessons.lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {

        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;

        System.out.println(twoDimArray[0][3]);

        int[][] twoDimArray2 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        for (int i = 0; i < twoDimArray2.length; i++) {
            for (int j = 0; j < twoDimArray2[i].length; j++) {
                System.out.print(" " + twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] twoDimArray3 = {{2, 5, 7, 13}, {7, 4, 2}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(twoDimArray3));

        sayHello();

        mySum(3, 5);
        mySum(6, 5);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        sayNameAndAge("Alex", 33);

    }

    static void sayHello() {
        System.out.println("Hello world");
    }

    static void mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }
}







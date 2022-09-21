package homeworks.homework8;

public class Homework8 {
    public static void main(String[] args) {
        System.out.println(showMinNumber(7, 3));

    }

    public static int showMinNumber(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;

        }
    }
}

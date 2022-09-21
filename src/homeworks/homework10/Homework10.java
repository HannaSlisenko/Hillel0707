package homeworks.homework10;

public class Homework10 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n + 1; i++) {
            for (int m = 0; m < n - i; m++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


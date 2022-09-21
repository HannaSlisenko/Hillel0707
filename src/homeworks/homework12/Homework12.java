package homeworks.homework12;

public class Homework12 {
    public static void main(String[] args) {
        numbersAndHelloWorld();
    }

    private static void numbersAndHelloWorld() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 != 0) && (i % 3 != 0)) {
                System.out.print(i + " ");
            } else if (i % 3 == 0) {
                System.out.print("Hello ");
            } else if (i % 5 == 0) {
                System.out.print("World ");
            }
        }
    }
}


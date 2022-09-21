package homeworks.homework11;

public class Homework11 {
    public static void main(String[] args) {

        int n = 1;
        while (n < 3) {
            System.out.println("Это " + n + "й урок!");
            System.out.println("    " + "Я выполнил все домашние задания " + n + "го урока.");
            n++;
        }
        System.out.println("Это " + n + "й урок!");
        System.out.println("    " + "Я не выполнил все домашние задания " + n + "го урока");
    }
}

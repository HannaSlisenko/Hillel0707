package homeworks.homework13;


public class Homework13 {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);

            System.out.print(array[i] + " ");
        }
        System.out.println();
        double average;
        double sum = 0;
        for (int j = 0; j < array.length; j++) sum += array[j];
        average = sum / array.length;
        System.out.println(average);
    }
}


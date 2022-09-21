package homeworks.homework18;

import java.util.Arrays;

public class HW18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


package lessons.mentor2;

import java.util.Arrays;

public class TaskArray {
    /**
     * Дано: массив целых чисел.
     * Требуется: Вывести на консоль отдельно чётные и нечётные числа.
     * Пример. Массив: 5, -3, -8, 81, 13
     * Вывод:
     * Чётные числа: -8
     * Нечётные: 5, -3, 81, 13
     * Примечание:
     * Вычисление чета и нечета должны быть оформлены в виде функций, которая как параметр берет
     * в себя исходный массив и возвращает вычисленый массив.
     * Печать на консоль должна быть оформлена в виде функции, которая на вход берет массив и выводит его на консоль,
     * используя цикл while. При этом формат должен быть:
     * <число>, <число>, <число>. В конце без запятой
     */
    public static void main(String[] args) {
        int[] array = {5, -3, -8, 81, 13, 8};
        System.out.println("Массив: ");
        printArray(array);
        System.out.println("Нечётные: ");
        int[] oddNumbers = oddNumbers(array);
        printArray(oddNumbers);
        System.out.println("Чётные: ");
        int[] evenNumbers = evenNumbers(array);
        printArray(evenNumbers);
    }

    public static int[] oddNumbers(int[] array) {
        int[] oddArray = new int[0];
        for (int item : array) {
            if ((item % 2) != 0) {
                int numbers = oddArray.length;
                oddArray = Arrays.copyOf(oddArray, oddArray.length + 1);
                oddArray[numbers] = item;
            }
        }
        return oddArray;
    }

    public static int[] evenNumbers(int[] array) {
        int[] evenArray = new int[0];
        int i = 0;
        while (i < array.length) {
            if ((array[i] % 2) == 0) {
                int numbers = evenArray.length;
                evenArray = Arrays.copyOf(evenArray, evenArray.length + 1);
                evenArray[numbers] = array[i];
            }
            i++;
        }
        return evenArray;
    }

    public static void printArray(int[] arr) {
        int lastElement = arr.length - 1;
        int index = 0;
        while (index < lastElement) {
            System.out.print(arr[index] + ",");
            index++;
        }
        System.out.println(arr[lastElement]);
    }
}

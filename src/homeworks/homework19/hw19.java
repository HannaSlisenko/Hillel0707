package homeworks.homework19;


public class hw19 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        resizeArray(a, 1);
    }

    public static int[] resizeArray(int[] array1, int addedElement) {
        int[] array2 = new int[array1.length + 1];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        array2[array2.length - 1] = addedElement;
        return array2;
    }
}
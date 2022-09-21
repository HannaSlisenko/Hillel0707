package homeworks.homework1;

public class Test3 {

    public static void main(String[] args) {
        //when needs sum of original values of variables
        int alex = 7;
        int maks = 9;
        int sum = alex + maks++;
        System.out.println(sum);

        //when needs sum of variables after increment
        int alex2 = 7;
        int maks2 = 9;
        maks2++;
        System.out.println(alex2 + maks2);
    }
}


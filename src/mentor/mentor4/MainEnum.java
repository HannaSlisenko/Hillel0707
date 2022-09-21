package mentor.mentor4;
// создать колледж, университет и школы -с помощью перечисления.
// Вывести их в последовательности

public class MainEnum {
    public static void main(String[] args) {

        for (Education item : Education.values()) {
            System.out.println(item);
        }
    }
}

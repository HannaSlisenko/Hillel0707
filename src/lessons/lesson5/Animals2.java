package lessons.lesson5;
/*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */

public class Animals2 {
    public static void main(String[] args) {
        int ship = 4;
        for (int i = 1; i < 5; i++) {
            String duck = "гуска";
            String ship1 = "вівця";
            if (i > 1) {
                duck = "гуски";
            }
            if (ship > 1) {
                ship1 = "вівці";
            }
            System.out.println("В хатинці є " + i + " " + duck + " " + ship-- + " " + ship1);
        }

    }
}

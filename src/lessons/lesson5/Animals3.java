package lessons.lesson5;
/*
в) Порахувати кількість ніг у кожного із наборів із розрахунку, що гуска має 2 ноги, а вівця чотири
Доповнити висновок на консоль:
“В хатинці є 1 гуска та 4 вівці. Кількість ніг = 18”
     “В хатинці є 2 гуски та 3 вівці. Кількість ніг = 16”
*/

public class Animals3 {
    public static void main(String[] args) {
        int sheep = 4;
        int duckleg = 2;
        int sheepleg = 4;
        for (int i = 1; i < 5; i++) {
            String duck = "гуска";
            String manySheep = "вівця";
            if (i > 1) {
                duck = "гуски";
            }
            if (sheep > 1) {
                manySheep = "вівці";
            }
            System.out.println("В хатинці є " + i + " " + duck + " " + sheep + " " + manySheep + " Кількість ніг = "
                    + (i * duckleg + sheep * sheepleg));
            sheep--;
        }
    }

}

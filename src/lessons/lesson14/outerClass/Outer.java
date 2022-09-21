package lessons.lesson14.outerClass;

public class Outer {

    int num;

    private static class Inner_Demo {
        public void print() {
            System.out.println("Это внутренний класс");
        }
    }

    void displayInner() {
        Inner_Demo inner_demo = new Inner_Demo();
        inner_demo.print();

    }
}

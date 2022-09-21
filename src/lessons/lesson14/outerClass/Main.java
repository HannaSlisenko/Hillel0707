package lessons.lesson14.outerClass;

public class Main {
    public static void main(String[] args) {


        Outer outer = new Outer();
        outer.displayInner();

        OuterLocalMethod outerLocalMethod = new OuterLocalMethod();
        outerLocalMethod.myMethod();
    }
}

package lessons.lesson14.outerClass;

public class OuterLocalMethod {

    void myMethod() {
        int num = 888;

//локальный метод внутреннего класса
        class MethodInnerDemo {
            public void print() {
                System.out.println("Это метод внутреннего класса" + num);
            }
        }

        class secondInnerDemo {
            public void num() {
                System.out.println(2 + 2);
            }

        }

        MethodInnerDemo methodInnerDemo = new MethodInnerDemo();
        methodInnerDemo.print();

    }
}

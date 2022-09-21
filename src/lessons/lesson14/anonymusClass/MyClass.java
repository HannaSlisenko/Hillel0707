package lessons.lesson14.anonymusClass;

public class MyClass {

    public void displayMessage(Message n) {
        System.out.println(n.sayHello() +
                ", это пример анонимного класса в качестве аргумента");
    }
}

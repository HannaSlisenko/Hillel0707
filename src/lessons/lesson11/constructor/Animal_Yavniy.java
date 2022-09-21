package lessons.lesson11.constructor;

public class Animal_Yavniy {

    public Animal_Yavniy() {

    }

    public Animal_Yavniy(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private String name;
    private int age;

    void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

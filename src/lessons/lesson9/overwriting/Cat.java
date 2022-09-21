package lessons.lesson9.overwriting;

public class Cat extends Animal {
    public void voice() {
        System.out.println("Гав");
        super.voice();
    }
}


package lessons.lesson13.abstractExample;

public class BMW extends Car {

    @Override
    String maxSpeed() {
        return null;
    }

    @Override
    void drive() {

    }

    @Override
    void brake() {

    }

    public void aboutBmw() {
        System.out.println("Thic is BMW");
        System.out.print("Wheels count");
        countWheels();
    }
}

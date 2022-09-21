package lessons.lesson9.incapsulation.Car;

import lessons.lesson9.incapsulation.Specififcatiion.Specific;

public class BMW {
    public static void main(String[] args) {
        Specific specific = new Specific();
        System.out.println(specific.fuel);

        specific.fuel = "Diesel";
        System.out.println(specific.fuel);

    }
}

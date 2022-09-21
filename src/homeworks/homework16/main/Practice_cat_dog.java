package homeworks.homework16.main;

import java.util.ArrayList;
import java.util.List;

import homeworks.homework16.cat_dog.animal.Animal;
import homeworks.homework16.cat_dog.cat.Cat;
import homeworks.homework16.cat_dog.dog.Dog;

public class Practice_cat_dog extends Animal {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
            // expected: I am a Dog. My name is Tuzik. Gav
            // expected: I am a Cat. My name Vasya. Mew
        }
    }
}

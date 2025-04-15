package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void studyingAbstraction() {
        // Animal animal new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        doAnimalStuff(dog);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 3 ));
        animals.add(new Fish("Goofball", "small", 5));
        animals.add(new Dog("Pug","medium", 10));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}

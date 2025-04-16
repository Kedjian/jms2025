package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void abstractionExercise3() {
        Rat unit1 = new Rat("Minikulek", 1, "Very small");
        unit1.doWhatCreaturesDo();
        System.out.println();

        Lion unit2 = new Lion("Drakulek", 2, "Relatively big");
        unit2.doWhatCreaturesDo();
        System.out.println();

        Deer unit3 = new Deer("Miłek", 1, "Medium");
        unit3.doWhatCreaturesDo();
        System.out.println();

        Tiger unit4 = new Tiger("Rogatek", 1, "Huge");
        unit4.doWhatCreaturesDo();
        System.out.println();

        Human unit5 = new Human("Oskar", 23, "Relatively big");
        unit5.doWhatCreaturesDo();
        System.out.println();
    }

    public static void abstractionExercise2() {
        CurrentAccount test = new CurrentAccount("Oskar",
                "Makowski", "05.08.2001", 500);
        test.deposit(10);
        test.deposit(-10);
        test.withdraw(50);
        System.out.println(test.showAccountState());

        SavingsAccount savingsTest = new SavingsAccount("Oskar",
                "Makowski", "05.08.2001", 6500);
        savingsTest.deposit(100);
        System.out.println(savingsTest.showAccountState());
    }

    public static void abstractionExercise1() {
        Triangle triangleTest = new Triangle(
                3.2, 2.1,
                5.3, 2.3);
        triangleTest.showResults();

        Circle circleTest = new Circle(3);
        circleTest.showResults();
    }

    public static void studyingAbstraction() {
        /// Animal animal new Animal("animal", "big", 100);
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

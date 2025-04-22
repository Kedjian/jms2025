package dev.lpa;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static void interfaceExercise4() {
        ResizableRectangle object1 = new ResizableRectangle(2,3);
        System.out.println(object1);
        object1.resizeHeight(5);
        object1.resizeWidth(3);
        System.out.println(object1);
    }

    public static void interfaceExercise3() {
        Helicopter object1 = new Helicopter("Boeing AH",
                "64 Apache", 12);
        System.out.println(object1.fly_obj());

        Airplane object2 = new Airplane("XL Ryanair",
                "Boeing 737");
        System.out.println(object2.fly_obj());

        Spacecraft object3 = new Spacecraft("Lithoid",
                "Mammalian Colossus");
        System.out.println(object3.fly_obj());
    }

    public static void interfaceExercise2() {
        CircleInterface circle = new CircleInterface(5);
        System.out.println(circle.getArea());

        SquareInterface square = new SquareInterface(2);
        System.out.println(square.getArea());

        RectangleInterface rectangle = new RectangleInterface(3, 2);
        System.out.println(rectangle.getArea());
    }

    public static void interfaceExercise1() {
        BirdInterface bird = new BirdInterface();
        AnimalInterfaces animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();

//        flier.takeOff();
//        flier.fly();
//        flier.land();
//        tracked.track();
//        tracked.stopTracking();

        inFlight(flier);
        inFlight(new JetInterface());
        Trackable truck = new TruckInterface();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof  Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }

    public static void abstractionExercise4() {
        Manager testManager = new Manager("Leon", "Bollywoodzki Inicjator",
                "LGBT Gaming Official",21, 31, 164);
        System.out.println(testManager.displayInfo());
        System.out.println(testManager.calculateSalary());
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

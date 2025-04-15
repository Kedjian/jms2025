package dev.lpa;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println("Wolf walking!");
        } else {
            System.out.println("Wolf running!");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
}

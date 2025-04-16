package dev.lpa;

public class Deer extends Creature {
    public Deer(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat() {
        System.out.print("The deer was fed by people in the forest, ");
    }

    @Override
    public void sleep() {
        System.out.print("the deer is too afraid to go to sleep, ");
    }

    @Override
    public void hunt() {
        System.out.print("the deer is a pacifist. ");
    }

    public void doWhatCreaturesDo() {
        eat();
        sleep();
        hunt();
    }
}

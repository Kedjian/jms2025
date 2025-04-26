package dev.lpa;

public class Tiger extends Creature {
    public Tiger(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat() {
        System.out.print("The tiger is eating a corpse of a deer, ");
    }

    @Override
    public void sleep() {
        System.out.print("the tiger looks sleepy, ");
    }

    @Override
    public void hunt() {
        System.out.print("the tiger wants to hunts some more. ");
    }

    public void doWhatCreaturesDo() {
        eat();
        sleep();
        hunt();
    }
}

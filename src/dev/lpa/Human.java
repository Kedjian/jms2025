package dev.lpa;

public class Human extends Creature {
    public Human(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat() {
        System.out.print("The human needs to remember about his groceries, ");
    }

    @Override
    public void sleep() {
        System.out.print("the human is exhausted and would like to go to sleep, ");
    }

    @Override
    public void hunt() {
        System.out.print("the human is too tired to do anything else. ");
    }

    public void doWhatCreaturesDo() {
        eat();
        sleep();
        hunt();
    }
}

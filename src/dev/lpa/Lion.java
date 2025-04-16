package dev.lpa;

public class Lion extends Creature {
    public Lion(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat() {
        System.out.print("The lion dines on its dinner, ");
    }

    @Override
    public void sleep() {
        System.out.print("the lion is getting sleepy, ");
    }

    @Override
    public void hunt() {
        System.out.print("the lion plans to hunt some more. ");
    }

    public void doWhatCreaturesDo() {
        eat();
        sleep();
        hunt();
    }
}

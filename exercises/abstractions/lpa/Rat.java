package dev.lpa;

public class Rat extends Creature {
    public Rat(String name, int age, String size) {
        super(name, age, size);
    }

    @Override
    public void eat() {
        System.out.print("The rat nom noms, ");
    }

    @Override
    public void sleep() {
        System.out.print("the rat thinks of sleeping, ");
    }

    @Override
    public void hunt() {
        System.out.print("the rat wants to go scavenging. ");
    }

    @Override
    public void doWhatCreaturesDo() {
        eat();
        sleep();
        hunt();
    }
}

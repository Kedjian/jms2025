package dev.lpa;

public abstract class Creature {
    protected String name;
    protected int age;
    protected String size;

    public Creature(String name,
                    int age,
                    String size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void hunt();
    public abstract void doWhatCreaturesDo();
}

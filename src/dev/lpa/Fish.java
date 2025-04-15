package dev.lpa;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " swims slow!");
        } else {
            System.out.println(getExplicitType() + " sprints underwater!");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Betta splendens") {
            System.out.println("Agressive blub blub!");
        } else {
            System.out.println("A typical blub blub!");
        }
    }
}

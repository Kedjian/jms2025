package dev.lpa;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public void showResults() {
        System.out.println("The area of the provided circle equals to: " +
                calculateArea() + ".");
        System.out.println("The perimeter of the provided circle equals to: " +
                calculatePerimeter() + ".");
    }
}

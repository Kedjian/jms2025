package dev.lpa;

public class Triangle extends Shape {
    public Triangle(double triangleBase, double triangleSecondSide, double triangleThirdSide, double triangleHeight) {
        super(triangleBase, triangleSecondSide, triangleThirdSide, triangleHeight);
    }

    protected double half = 0.5;

    @Override
    public double calculateArea() {
        return half * triangleBase * triangleHeight;
    }

    @Override
    public double calculatePerimeter() {
        return triangleBase + triangleSecondSide + triangleThirdSide;
    }

    @Override
    public void showResults() {
        System.out.println("The area of the provided triangle equals to: " +
                calculateArea() + ".");
        System.out.println("The perimeter of the provided triangle equals to: " +
                calculatePerimeter() + ".");
    }
}

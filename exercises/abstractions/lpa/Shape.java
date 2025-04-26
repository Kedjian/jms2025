package dev.lpa;

public abstract class Shape {
    protected double pi = Math.PI;
    protected double radius;
    protected double triangleBase;
    protected double triangleSecondSide;
    protected double triangleThirdSide;
    protected double triangleHeight;

    public Shape(double radius) {
        this.radius = radius;
    }

    public Shape(double triangleBase, double triangleSecondSide,
                 double triangleThirdSide, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleSecondSide = triangleSecondSide;
        this.triangleThirdSide = triangleThirdSide;
        this.triangleHeight = triangleHeight;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract void showResults();
}

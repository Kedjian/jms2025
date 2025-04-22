package dev.lpa;

interface ShapeInterface {
    double getArea();
}

class RectangleInterface implements ShapeInterface {

    protected double length;
    protected double width;

    public RectangleInterface(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class SquareInterface implements ShapeInterface {

    protected double side;

    public SquareInterface(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

class CircleInterface implements ShapeInterface {

    protected double radius;

    public CircleInterface(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}



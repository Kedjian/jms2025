package dev.lpa;

interface Resizable {
    double resizeWidth(double width);
    double resizeHeight(double height);
}

class ResizableRectangle implements Resizable {

    protected double width;
    protected double height;

    public ResizableRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double resizeWidth(double width) {
        this.width = width;
        return width;
    }

    @Override
    public double resizeHeight(double height) {
        this.height = height;
        return height;
    }

    @Override
    public String toString() {
        return "ResizableRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
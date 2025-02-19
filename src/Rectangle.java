public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        if (width < 0) {
            width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}

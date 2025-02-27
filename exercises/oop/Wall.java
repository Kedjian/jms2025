public class Wall {
    private double width;
    private double height;

    public Wall() {
        width = 2.5;
        height = 2.5;
    }

    public Wall(double width, double height) {
        if (width <= 0) {
            width = 0;
            if (height <= 0) {
                height = 0;
            }
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

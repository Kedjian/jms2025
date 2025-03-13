public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public Lamp() {}

    public void turnOn() {
        System.out.println("Lamp is on.");
    }
    public String getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }
}

class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed () {}

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make() {
        System.out.println("Bed is being made.");
    }
}

class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling() {}

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}

class Walls {
    private String direction;

    public Walls() {}

    public Walls(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}

class Bedroom {
    public String name;
    public Walls walls1;
    public Walls walls2;
    public Walls walls3;
    public Walls walls4;
    public Ceiling ceiling;
    public Bed bed;
    public Lamp lamp;

    public Bedroom(String name, Walls walls1, Walls walls2,
                   Walls walls3, Walls walls4, Ceiling ceiling,
                   Bed bed, Lamp lamp) {
        this.name = name;
        this.walls1 = walls1;
        this.walls2 = walls2;
        this.walls3 = walls3;
        this.walls4 = walls4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    Lamp getLamp() { return lamp; }
    void makeBed() {
        bed.make();
    }
}
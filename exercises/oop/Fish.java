public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish() {
        super("Nemo", "small", 15);
    }

    public Fish(String type, String size, double weight) {
        this(type, size, weight, 4, 5);
    }

    public Fish(String type, String size, double weight, int fins, int gills) {
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.fins = fins;
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        moveBackFins();
    }

    public void makeNoise() {
        System.out.println("Fish blub blubs");
    }

    public void moveMuscles() {
        System.out.println("Fish moves muscles");
    }

    public void moveBackFins() {
        System.out.println("Fish moves back fins");
    }
}

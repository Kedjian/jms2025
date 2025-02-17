public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public TrafficLight() {
        this.color = "red";
        this.duration = 0;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void describeTrafficLight() {
        System.out.println("Traffic Light: " + color);
        System.out.println("Duration: " + duration);
    }
}

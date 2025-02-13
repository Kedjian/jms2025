public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public void describeCar() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Doors : " + doors);
        System.out.println(convertible ? "Convertible" : "Not convertible");
    }
}

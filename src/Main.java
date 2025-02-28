public class Main {
    public static void main(String[] args) {
        billBurgerTest();
    }

    public static void billBurgerTest() {
        BillBurger newBurger = new BillBurger();
        System.out.println(newBurger);

        BillBurger oldBurger = new BillBurger("Unregular burger", "Unregular drink", "Unregular side item.");
        System.out.println(oldBurger);
    }

    public static void carTest() {
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}

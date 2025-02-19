import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OSX");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }

    public static void virusTest() {
        DnaVirus Poliovirus = new DnaVirus("ssRNA", "icosahedral",
                "animals", "Group IV",
                "fecal-oral transmission", "poliomyelitis",
                "true", "false");
        System.out.print(Poliovirus.toString());
    }

    public static void rectangleTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public static void circleTest() {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

    public static void stringFormattingTest() {
        String bulletId = "Print a bulleted list:\n" +
                "\t\u2022 First point\n" +
                "\t\t\u2022 Sub point\n";

        String textBlock = """
               Print a bulleted list:
               - first point: 
               - sub point:
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("You are %d years old.\n", age);

        int yearOfBirth = 2025 - age;
        System.out.printf("Birth year is %d.\n", yearOfBirth);
    }

    public static void workerTest() {
        Employee worker1 = new Employee("Caroline", "11/11/1985", "10/11/1985");

        System.out.println(worker1);

        SalariedEmployee worker2 = new SalariedEmployee("Anastacia", "01/02/2020", "11/11/1985", 58000, false);
        System.out.println(worker2);

        worker2.collectPay();
        worker2.retire();
        worker2.collectPay();

        worker2.getAge();
        worker1.getAge();

        Employee worker3 = new Employee("Oscar", "05/08/2001", "08/04/2024");
        System.out.println(worker3);
    }

    public static void animalTest() {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Cat cat = new Cat();
        doAnimalStuff(cat, "slow");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish nemo = new Fish("Funny", "small", 5, 3, 4);
        doAnimalStuff(nemo, "relatively fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

    public static void trafficLightTest() {
        TrafficLight test = new TrafficLight("yellow", 5);
        test.describeTrafficLight();

        test.setColor("green");
        System.out.println(test.getColor());
    }

    public static void weatherStationTest() {
        WeatherStation canadaStation = new WeatherStation("Canada Weather Station",
                "23.7 Celsius", "96%", "3km/h",
                "North", "Possible thunderstorms");

        System.out.println(canadaStation);
        canadaStation.describeWeatherStation();

        System.out.println(" ");

        canadaStation.setStationName("Canada Second Weather Station");
        canadaStation.setHumidity("62%");
        canadaStation.setTemperature("10.2 Celsius");
        canadaStation.describeWeatherStation();

        System.out.println(" ");

        canadaStation.setObservation("Thunderstorms incoming");
        canadaStation.describeWeatherStation();
    }

    public static void complexNumbersTest() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImag());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImag());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImag());
    }

    public static void costCalculatorTest() {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

    public static void pointTest() {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public static void wallTest() {
        Wall test = new Wall();
        System.out.println(test.getArea());
        System.out.println(test.getWidth());
        System.out.println(test.getHeight());

        Wall test1 = new Wall(5, 4);
        System.out.println(test1.getArea());
        System.out.println(test1.getWidth());
        System.out.println(test1.getHeight());

        Wall test2 = new Wall(-5, -10);
        System.out.println(test2.getArea());
        System.out.println(test2.getWidth());
        System.out.println(test2.getHeight());
    }

    public static void studentTest() {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Jack";
                        case 4 -> "John";
                        case 5 -> "Michael";
                        default -> "Anonymous";
                    },
                    "05/11/1962",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }

    public static void temperatureTest() {
        Temperature celsius = new Temperature();
        celsius.CTF(50, 54);
        celsius.describeCndF();
        celsius.convertCTF();
        celsius.convertFTC();
    }

    public static void customerChrisTest() {
        Customer Chris = new Customer("Chris", 1500, "Fishfuck22@gmail.com");
        System.out.println(Chris.getName());
        System.out.println(Chris.getEmail());
        System.out.println(Chris.getCreditLimit());

        Customer Chris1 = new Customer();
        System.out.println(Chris1.getName());
        System.out.println(Chris1.getEmail());
        System.out.println(Chris1.getCreditLimit());

        Customer Chris2 = new Customer("Chris", "Fishfuck22@gmail.com");
        System.out.println(Chris2.getName());
        System.out.println(Chris2.getEmail());
        System.out.println(Chris2.getCreditLimit());
    }

    public static void buchwaldTest() {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Is teen? " + person.isTeen());
        person.setFirstName("Caroline");
        person.setAge(18);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Is teen? " + person.isTeen());
        person.setLastName("Buchwald");
        System.out.println("Full name: " + person.getFullName());
    }

    public static void calculatorTest() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(2.0);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
        calculator.setFirstNumber(9.25);
        calculator.setSecondNumber(1.5);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
    }

    public static void bankTest() {
        Scanner sc = new Scanner(System.in);

        BankAccount OsMak = new BankAccount("Chris-chan", "Chris-chan-desu@weebneet.com", "694201337");
        OsMak.describeBankAccount();

//        BankAccount OsMak = new BankAccount("12345",
//                1000.00, "Bob Brown",
//                "myemail@bob.com", "(087) 123-4567");

        do {
            System.out.println("What do you want to do? Print (1) to deposit. Print (2) to withdraw. ");
            String command = sc.nextLine();
            if (command.equals("1")) {
                System.out.println("Enter amount to deposit: ");
                double deposit = 0;
                try {
                    deposit = sc.nextDouble();
                } catch (InputMismatchException wrongData) {
                    System.out.println("Please enter a valid number.");
                }
                sc.nextLine();
                OsMak.DepositFunds(deposit);
            } else if (command.equals("2")) {
                System.out.println("Enter amount to withdraw: ");
                double withdraw = 0;
                try {
                    withdraw = sc.nextDouble();
                } catch (InputMismatchException wrongData) {
                    System.out.println("Please enter a valid number.");
                }
                sc.nextLine();
                OsMak.WithdrawFunds(withdraw);
            } else {
                System.out.println("Invalid command. Try again.");
            }
        } while (true);
    }
}
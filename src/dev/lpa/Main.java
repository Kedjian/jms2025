package dev.lpa;
import java.util.*;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", count, type, name);
    }
}

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal());

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

    private static void bankApplicationTest() {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }

    private static void rememberingOOP() {
        ElectronicsProduct iPhone12 = new ElectronicsProduct("00033221", "iPhone12", 425);
        System.out.println(iPhone12.calculateFlatAmountDiscount(25));
        System.out.println(iPhone12.calculatePercentageDiscount(50));

        WashingMachine boschWashingMachine = new WashingMachine("00044332", "Typical washing machine", 1250, 364);
        System.out.println(boschWashingMachine.getWarrantyDays());
        boschWashingMachine.extendWarranty(123);
        System.out.println(boschWashingMachine.getWarrantyDays());

        System.out.println(boschWashingMachine.calculateFlatAmountDiscount(500));
        System.out.println(boschWashingMachine.calculatePercentageDiscount(99));

        WashingMachine secondWashingMachine = new WashingMachine("000444332", "Second machine", 1500, 120);
    }

    private static void autoboxingPractice() {
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        /// Integer deprecatedBoxing = new Integer(15); deprecated
        int unboxedInt = boxedInt.intValue();

        // automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        System.out.println(resultBoxed);
        System.out.println(resultUnboxed);

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int var : varargs) {
            list.add(var);
        }
        return list;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

    private static void PlaylistCreator() {
        Album album = new Album("Stormbringer", "Deep Purple");
        boolean add = album.addSong("Stormbringer", 4.2);
        boolean addSame = album.addSong("Stormbringer", 4.2);
        album.addSong("Love don't mean a thing", 4.22);
    }

    public static ListIterator<Town> iterator;
    private static void linkedListExercise1() {
        LinkedList<Town> towns = new LinkedList<>();
        towns.add(new Town("Chojna", 0));
        towns.add(new Town("Szczecin", 66));
        towns.add(new Town("Gryfino", 38));
        towns.add(new Town("Stargard", 53));
        towns.add(new Town("Bytom", 492));
        sortTownsByDistance(towns);
        iterator = towns.listIterator();

        while (true) {
            System.out.println("""
                Available actions: (select word or letter)
                (F)orward
                (B)ackward
                (L)ist Places
                (Q)uit
                """);

            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                switch (line) {
                    case "F", "Forward" -> forwardTheLinkedList(towns);
                    case "L", "List Places" -> listPlaces(towns);
                    case "B", "Backward" -> backwardTheLinkedList(towns);
                    case "Q", "Quit" -> {
                        System.out.println("Goodbye!");
                        break;
                    }
                }
            }
        }
    }

    private static void forwardTheLinkedList(LinkedList<Town> towns) {
        if (iterator.hasNext() && iterator != null) {
            Town town = iterator.next();
            System.out.println(town.townName);
            if (!iterator.hasNext()) {
                System.out.println("You're at the end of the list!");
            }
        }
    }

    private static void backwardTheLinkedList(LinkedList<Town> towns) {
        if (iterator.hasPrevious() && iterator != null) {
            Town town = iterator.previous();
            System.out.println(town.townName);
            if (!iterator.hasPrevious()) {
                System.out.println("You're at the beginning of the list!");
            }
        }
    }

    private static void listPlaces(LinkedList<Town> towns) {
        int i = 0;
        ListIterator<Town> iterator = towns.listIterator();
        while (iterator.hasNext()) {
            Town town = iterator.next();
            if (town.distanceFromStart == 0) {
                System.out.println("Starting location: " + town.townName);
            } else {
                i++;
                if (i == 1) {
                    System.out.println(i + "st station: " + town.townName);
                } else if (i == 2) {
                    System.out.println(i + "nd station: " + town.townName);
                } else if (i == 3) {
                    System.out.println(i + "rd station: " + town.townName);
                } else {
                    System.out.println(i + "th station: " + town.townName);
                }
            }
        }
    }

    private static void sortTownsByDistance(LinkedList<Town> towns) {
        towns.sort(Comparator.comparingInt(Town::getDistanceFromStart));
    }

    private static void iteratorTesting() {
        LinkedList<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Brisbane", "Orcish", "Elvish", "Golden"));

        testIterator(list);
    }

    private static void contains65and77Test() {
        int[] a = {1, 2, 3, 65};
        int[] b = {1, 2, 3, 4, 5, 65, 77};
        contains65And77(a);
        contains65And77(b);
    }

    private static void contains65And77(int[] arr) {
        boolean var1 = false;
        boolean var2 = false;
        for (int j : arr) {
            if (j == 65) {
                var1 = true;
                System.out.println(j + " " + "65");
            }
            if (j == 77) {
                var2 = true;
                System.out.println(j + " " + "77");
            }
        }
        if (var1 && var2) {
            System.out.println("Presented array contains both an integer of 65 and 77.");
        } else {
            System.out.println("Presented array does not contain both an integer of 65 and 77.");
        }
    }
    
    private static void sumUpTo30Test(int[] arr) {
        int[] a = {1, 2, 3, 4, 5};
        sumUpTo30(a);
        int[] b = {10, 10, 10, 10};
        sumUpTo30(b);
        int[] c = {10, 10, 10};
        sumUpTo30(c);
    }

    private static void sumUpTo30(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                sum = sum + arr[i];
                }
            }
        if (sum == 30) {
            System.out.println("The sum of all 10's is 30.");
        } else {
            System.out.println("The sum of all 10's is not 30.");
        }
    }

    private static void differentiateBNTSNTest() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(4, 8, 10, 12, 16, 18, 23, 19));
        differentiateBNTSN(a);
    }

    private static void differentiateBNTSN(ArrayList<Integer> a) {
        a.sort(Comparator.naturalOrder());
        int lastNumPos = a.size() - 1;
        int differentiate = a.get(lastNumPos) - a.get(0);
        System.out.println(differentiate);
    }

    private static void summarizeEvenAndOddTest() {
        int[] num_array = new int[]{10, 13, 27, 63, 72, 91, 104, 205, 574};
        summarizeEvenAndOdd(num_array);
    }

    private static void summarizeEvenAndOdd(int[] array) {
        int oddNum = 0;
        int evenNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenNum = evenNum + 1;
            } else {
                oddNum = oddNum + 1;
            }
        }
        System.out.println("Even nums: " + evenNum + ".");
        System.out.println("Odd nums: " + oddNum + ".");
    }

    private static void linkedListExercise() {
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);
        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack methods
        list.push("Alice Springs");
        list.push("A cat named Ryan");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);

        String s1 = list.remove();
        System.out.println(s1 + " was removed.");
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed.");
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed.");

        String p1 = list.poll();
        System.out.println(p1 + " was removed.");
        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed.");
        String p3 = list.pollLast();
        System.out.println(p3 + " was removed.");

        list.push("Sydney");
        list.push("Darwin");
        list.push("Hobart");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed.");
    }

    public static void subListCreation() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Original list: " + list);
        List<String> subList = list.subList(0, 2);
        System.out.println("Sublist: " + subList);
    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved element = " + list.get(1));
        System.out.println("Retrieved element = " + list.getFirst());
        System.out.println("Retrieved element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Sydney is at position: " + list.indexOf("Sydney"));

        System.out.println("Element from element() = " + list.element());
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("---> From: " + list.get(i - 1) + ", to: " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("---> From: " + previousTown + ", to: " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("---> From: " + previousTown + ", to: " + town);
            previousTown = town;
        }
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
           // System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Nightbornish");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }

    public static void collectionShuffle() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void searchForAnElementTest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);
        searchForAnElement(list, 5);
    }

    public static void searchForAnElement(ArrayList<Integer> list, int data) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == data) {
                System.out.println("Element found: ");
                System.out.println(list.get(i));
                System.out.println("At index: " + list.indexOf(list.get(i)) + ".");
            }
        }
    }

    public static void deleteThirdElement() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }

    public static void updateAnArrayTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Meow");
        list.add("Brown");
        list.add("Chocolate");
        updateAnArray(list, 0, "Not-meow");
    }

    public static void updateAnArray(ArrayList<String> array, int index, String data) {
        array.set(index, data);
        System.out.println(array);
    }

    public static void elementInsertTest() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(0, "0");
        list.add(4, "1");
        list.add(0, "0");
        System.out.println(list);
    }

    public static void iterateThroughAnArrayList(ArrayList<String> arrayList) {
        for (String item : arrayList) {
            System.out.println(item);
        }
    }

    public static void pairsToSpecifiedNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println(array[i] + " + " + array[j] + " = " + number);
                }
            }
        }
    }

    public static void checkIf(int[] array) {
        for (int j : array) {
            if (j == 0) {
                System.out.println("INCORRECT INPUT");
                System.out.println(j);
            } else if (j == -1) {
                System.out.println("INCORRECT INPUT");
                System.out.println(j);
            } else {
                System.out.println("CORRECT INPUT");
                System.out.println(j);
            }
        }
    }

    public static void arrayEqualityTest() {
        String[] myArray = {"1", "2", "3", "4", "5", "6"};
        ArrayList<String> firstArray = new ArrayList(Arrays.asList(myArray));
        String[] mySecondArray = {"1", "2", "3", "4", "5", "6"};
        ArrayList<String> secondArray = new ArrayList(Arrays.asList(mySecondArray));
        if (firstArray.equals(secondArray)) {
            System.out.println("First array equals second array.");
        } else {
            System.out.println("Second array does not equal first array.");
        }
    }

    public static void arrayListToAnArrayAndArrayToAnArrayList() {
        String[] my_array = new String[] { "A", "B", "C", "D", "E", "F", "G" };
        ArrayList list = new ArrayList(Arrays.asList(my_array));
        System.out.println(list);

        ArrayList<String> listList = new ArrayList<String>();
        listList.add("A");
        listList.add("B");
        listList.add("C");
        listList.add("D");
        listList.add("E");
        listList.add("F");
        listList.add("G");

        String[] my_arrayMy_Array = new String[list.size()];
        listList.toArray(my_arrayMy_Array);

        for (String s : my_arrayMy_Array) {
            System.out.println(s);
        }
    }

    public static void mobilePhoneTest() {
        Contact Sarah = new Contact("Sarah", "742832132");
        Contact Bob = new Contact("Bob", "678921322");
        Contact Roksana = new Contact("Roksana", "678921322");

        MobilePhone Oskar = new MobilePhone("572434744");
        Oskar.addNewContact(Sarah);
        Oskar.addNewContact(Bob);
        Oskar.printContacts();

        MobilePhone Ref = new MobilePhone("521423224");
        Ref.addNewContact(Roksana);
        Ref.printContacts();
    }

    public static void groceryItemTest() {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Bread", "Produce", 6);
        groceryArray[2] = new GroceryItem("Cheese", "Produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Milk", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("Apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }

    public static void sayHelloToThePersonSeeingThis(String Name) {
        System.out.println("Hello " + Name + "!");
    }
}
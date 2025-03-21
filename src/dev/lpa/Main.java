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
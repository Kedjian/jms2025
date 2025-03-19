package dev.lpa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
package dev.lpa;
import java.util.ArrayList;
import java.util.Arrays;

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
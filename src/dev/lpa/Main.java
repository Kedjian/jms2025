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
//        GroceryItem[] groceryArray = new GroceryItem[3];
//        groceryArray[0] = new GroceryItem("Milk");
//        groceryArray[1] = new GroceryItem("Bread", "Produce", 6);
//        groceryArray[2] = new GroceryItem("Cheese", "Produce", 5);
//        System.out.println(Arrays.toString(groceryArray));

//        ArrayList objectList = new ArrayList();
//        objectList.add(new GroceryItem("Butter"));
//        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Milk", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("Apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
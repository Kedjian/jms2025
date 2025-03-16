package dev.lpa;

import java.util.*;

public class InteractiveList {
    public static void main(String[] args) {
        ArrayList<String> dynamicList = new ArrayList<>();
        label:
        while (true) {
            displayInfo();
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "0":
                    System.out.println("Enter a string you'd like to add to your list: ");
                    input = sc.nextLine();
                    addToList(dynamicList, input);
                    break;
                case "1":
                    System.out.println("Enter a string you'd like to remove from your list: ");
                    input = sc.nextLine();
                    removeFromList(dynamicList, input);
                    break;
                case "2":
                    System.out.println("Discontinuing programme.");
                    printTheList(dynamicList);
                    break label;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void displayInfo() {
        String textBlock = """
                
                Interactive list programme.
                
                Choose 0 to add something to your list.
                Choose 1 to remove something from your list.
                Choose 2 to stop the programme.
                """;
        System.out.println(textBlock);
    }

    private static void sortTheList(ArrayList<String> list) {
        list.sort(Comparator.naturalOrder());
    }

    private static void printTheList(ArrayList<String> list) {
        System.out.println("The list contains: " + list);
    }

    private static void addToList(ArrayList<String> list, String anItem) {
        if (list.contains(anItem)) {
            sortTheList(list);
            System.out.println(anItem + " is already in the list. It's index is " + list.indexOf(anItem));
            printTheList(list);
        } else {
            sortTheList(list);
            list.add(anItem);
            printTheList(list);
        }
    }

    private static void removeFromList(ArrayList<String> list, String anItem) {
        if (list.contains(anItem)) {
            sortTheList(list);
            list.remove(anItem);
            printTheList(list);
        } else {
            sortTheList(list);
            System.out.println(anItem + " is not in the list. It cannot be removed.");
            printTheList(list);
        }
    }
}
package dev.lpa;

import java.util.List;

public class ListSearch {
    public static <T> int search_Through_List(List<T> elements, T targetElement) {

        for (T element : elements) {
            if (element.equals(targetElement)) {
                System.out.println("Found a matching element! Index: "
                        + elements.indexOf(element) + " | Element name: " + element);
                return elements.indexOf(element);
            }
        }
        System.out.println("No matching element found.");
        return -1;
    }
}

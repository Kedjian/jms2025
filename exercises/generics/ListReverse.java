package dev.lpa;

import java.util.List;

public class ListReverse {
    public static <T> List<T> reverse_a_List(List <T> elements) {
        List<T> reversedList = new java.util.ArrayList<>(List.of());
        for (int i = elements.size() - 1; i >= 0; i--) {
            reversedList.add(elements.get(i));
        }
        System.out.println(reversedList);
        return reversedList;
    }
}

package dev.lpa;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PredicateArray {
    public static <T> List<T> predicate_Arrays(List<T> array, List<T> secondArray) {
        List<T> predicativeArray = new ArrayList<>();

        for (T element1 : array) {
            for (T element2 : secondArray) {
                if (element1.equals(element2)) {
                    predicativeArray.add(element1);
                    break;
                }
            }
        }
        System.out.println(predicativeArray);
        return predicativeArray;
    }
}

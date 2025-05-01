package dev.lpa;

import java.util.ArrayList;

public class ArrayListMerger {
    public static <T> ArrayList<T> mergeArrays(ArrayList<T> arr1, ArrayList<T> arr2) {
        ArrayList<T> mergedArray = new ArrayList<T>();

        int maxLength = Math.max(arr1.size(), arr2.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.size()) {
                mergedArray.add(arr1.get(i));
            }

            if (i < arr2.size()) {
                mergedArray.add(arr2.get(i));
            }
        }

        System.out.println(mergedArray);
        return mergedArray;
    }
}

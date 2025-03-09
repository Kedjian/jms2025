package dev.lpa;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        kodlandTest();
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println(Arrays.toString(sortedArray));
                }
            } System.out.println(Arrays.toString(sortedArray));
        } return sortedArray;
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(10);
        }
        return newInt;
    }

    public static void arrayStudies() {
        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[2]);

        int[] firstTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println(firstTen[arrayLength - 1]);

//        int[] newArray = { 5, 4, 3, 2, 1 };
        int[] newArray = new int [5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        System.out.println(newArray[newArray.length - 1]);
        for (int j : newArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("Object objectVariable is really an int array.");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "David") >= 0) {
            System.out.println("Found David in the list.");
        } else {
            System.out.println("David not found in the list.");
        }

        int[] s1 = { 1, 2, 3, 4, 5};
        int[] s2 = { 2, 1, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("S1 and S2 are the same.");
        } else {
            System.out.println("S1 and S2 are not the same.");
        }

        Arrays.sort(s2);
        if (Arrays.equals(s1, s2)) {
            System.out.println("S1 and S2 are the same.");
        } else {
            System.out.println("S1 and S2 are not the same.");
        }
    }

    public static void kodlandTest() {
        Worker OM = new Worker("Oskar", "Makowski",
                "Teacher of Python and Lua", 12,
                2);
        System.out.println(OM);
        OM.calculateSalary("March");
        OM.setQualityParameters(9,29.0,
                53.0, 93.0, 91.0);
        OM.calculateWorkQuality();
    }
}

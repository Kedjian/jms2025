package dev.lpa;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        int[] arr = {1, 3, 5, 10, 12};
        System.out.println(averageOfAnArray(arr));

        int[] arr2 = {69, 2137, 1337, 420};
        System.out.println(averageOfAnArray(arr2));
    }

    private static double averageOfAnArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        } return (double) sum / array.length;
    }

    private static void printGrid() {
        String[] arr = {" _ ".repeat(10)};
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void summedIntegersOfAnArray() {
        int[] arr = {1337, 69, 2137, 420};
        System.out.println(sumIntegersOfAnArray(arr));
    }

    private static int sumIntegersOfAnArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        } return sum;
    }

    private static void testingArrayStuff() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];                    // 1
            array[i] = array[maxIndex - i];         // 2
            array[maxIndex - i] = temp;             // 3
        }
    }

    private static void dynamicArrayAllocation() {
        int i = readInteger();
        int [] arr = readElements(i);
        findMin(arr);
    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        return sc.nextInt();
    }

    private static int[] readElements(int i) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[i];
        for (int a = 0; a < i; a++) {
            System.out.println("Enter element " + a + ": ");
            arr[a] = sc.nextInt();
        } return arr;
    }

    private static void arrayStudies1() {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println(returnedMin);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        System.out.println("Min: " + min);
        return min;
    }


    private static void delimiters() {
        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        String[] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }

    private static void arrayReferences() {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println(Arrays.toString(anotherArray));
        System.out.println(Arrays.toString(myIntArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println(Arrays.toString(anotherArray));
        System.out.println(Arrays.toString(myIntArray));

        //arrays can refer each other. anotherArray holds reference to myIntArray, and although it looks like
        //we have two arrays, that's simply not true. we only have one array in memory there, the myIntArray. it just can be
        //accessed by anotherArray as well.
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }

    private static void arrayRecap() {
        int[] array = new int[5]; //array has n elements, and is indexed from 0. the last index is equivalent to n-1.
        int[] myArray = {10, 35, 20, 17, 18}; //array has  5 elements. myArray[0] is equal to 10. myArray[1] is equal to 35.

        //ArrayIndexOutOfBoundsException means that we asked for an index that DOES NOT exist.
        //a good example would be myArray[5]. it has only five elements, so by the logic of the last index being
        //(n-1), the last index is 4. asking for 5th doesn't work.

        //to go through arrays with loops, we shouldn't set i to 1. if we do so, they will skip the first index.
        //to go through arrays with loops, we should be mindful of how many times the loop iterates.

        //generally, most of the problems regarding loops come from wrong index usages. enhanced for loops should be used.
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

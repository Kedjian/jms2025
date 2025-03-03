package dev.lpa;

public class Main {
    public static void main(String[] args) {
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

        int[] newArray = { 5, 4, 3, 2, 1 };
        System.out.println(newArray[newArray.length - 1]);
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }

    public static void kodlandTest() {
        Worker OM = new Worker("Oskar", "Makowski",
                "Teacher of Python and Lua", 9,
                2);
        System.out.println(OM);
        OM.calculateSalary("March");
        OM.setQualityParameters(9,29.0,
                53.0, 93.0, 91.0);
        OM.calculateWorkQuality();
    }
}

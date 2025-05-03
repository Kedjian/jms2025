package dev.lpa;

import java.util.List;

public class EvenOddSummer {
    public static <T extends Number> void sum_Even_and_Odd(List<T> numbers) {
        int oddSum = 0;
        int evenSum = 0;

       for (T number: numbers) {
           if (number.doubleValue() % 2 == 0) {
               evenSum += number.doubleValue();
           } else {
               oddSum += number.doubleValue();
           }
       }
       System.out.println("Original list of numbers: " + numbers);
       System.out.println("Sum of even numbers: " + evenSum);
       System.out.println("Sum of odd numbers: " + oddSum);
    }
}

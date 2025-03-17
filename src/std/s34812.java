package std;

public class s34812 {
    public static void main(String[] args) {
        int decimalValue = 165;
        int secondDecimalValue = 12;

        System.out.println("ĆW 2.1");

        String binaryValue = Integer.toBinaryString(decimalValue);
        String octalValue = Integer.toOctalString(decimalValue);
        String hexValue = Integer.toHexString(decimalValue);

        String secondBinaryValue = Integer.toBinaryString(secondDecimalValue);
        String secondOctalValue = Integer.toOctalString(secondDecimalValue);
        String secondHexValue = Integer.toHexString(secondDecimalValue);

        System.out.println("Binary: " + binaryValue);
        System.out.println("Octal: " + octalValue);
        System.out.println("Hex: " + hexValue);

        System.out.println("Second Binary: " + secondBinaryValue);
        System.out.println("Second Octal: " + secondOctalValue);
        System.out.println("Second Hex: " + secondHexValue);

        System.out.println();
        System.out.println("ĆW 2.2");

        int value = 14;

        System.out.println("After shifting 0 positions to the right: " + value + ".");

        int resultLeftTwo = value << 2;
        System.out.println("After shifting 2 positions to the left: " + resultLeftTwo + ".");

        int resultRightFour = resultLeftTwo >> 4;
        System.out.println("After shifting 4 positions to the right: " + resultRightFour + ".");
    }
}

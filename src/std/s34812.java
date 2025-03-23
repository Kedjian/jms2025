package std;

public class s34812 {
    public static void main(String[] args) {
        // standard notation of a numeric literal
        System.out.println(10);
        // octal notation
        System.out.println(010);
        // hexadecimal notation
        System.out.println(0x10);
        // binary notation
        System.out.println(0b1010);

        // bitwise negation
        // 0 to 1; 1 to 0
        System.out.println(~0b0101);

        // bitwise AND
        // 1 & 1 = 1; 0 & 1 = 0; 1 & 0 = 0; 0 & 0 = 0
        System.out.println(0b1100 & 0b1010);

        // bitwise OR
        // 1 | 1 = 1; 0 | 1 = 1; 1 | 0 = 1; 0 | 0 = 0
        System.out.println(0b1100 | 0b1010);

        // bitwise XOR
        // 1 ^ 1 = 0; 1 ^ 0 = 1; 0 ^ 1 = 1; 0 ^ 0 = 0
        System.out.println(0b1100 ^ 0b1010);
    }
}

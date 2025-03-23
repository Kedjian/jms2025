package std;

public class pjatkppj {
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

        // bitwise shift operations
        System.out.println(0b1010 << 2);
        // binary:  0000 1010  (10 in decimal)
        // left shift by 2:  0010 1000  (which is 40 in decimal)
        System.out.println(0b1010 >> 2);
        // binary:  0000 1010  (10 in decimal)
        // right shift by 2:  0000 0010  (which is 2 in decimal)

        // a variable is a memory area in which data is stored
        // the type of variable determines the size of the area,
        // the range of values that can be assigned to the variable,
        // and the representation of the data

        // predicative type
        boolean var = true;
        var = false;
        // can hold true or false [1 bit]

        // numerical type
        //integers
        byte byteVar = 1;
        // can hold [1 bit]

        short shortVar = 2;
        // can hold [2 bit]

        int intVar = 3;
        // can hold [4 bit]

        long longVar = 4;
        // can hold [8 bit]
        //real numbers
        float floatVar = 5;
        // can hold [4 bit]

        double doubleVar = 6;
        // can hold [8 bit]

        // char type
        char charVar = 'a';
        // can hold [2 bit]

        variableStudies();
    }

    public static void variableStudies() {
        // post incrementation
        int value = 10;
        System.out.println(value++);
        System.out.println(value);

        // pre incrementation
        int value2 = 10;
        System.out.println(++value2);
        System.out.println(value2);

        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println(z);
        System.out.println(x);

        byte smallVal;
        smallVal = (byte) z;
        System.out.println(smallVal);
    }
}

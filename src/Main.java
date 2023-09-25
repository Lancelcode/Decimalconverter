
public class Main {
    public static void main(String[] args) {
        int decimalValue = 12;
        String binaryEquivalent = decimalToBinary(decimalValue);
        String hexEquivalent = decimalToHex(decimalValue);

        System.out.println("INPUT: Decimal Value entered is " + decimalValue);
        System.out.println("OUTPUT: Binary Equivalent is " + binaryEquivalent);
        System.out.println("OUTPUT: Hex Equivalent is " + hexEquivalent);
    }

    public static String decimalToBinary(int decimalValue) {
        return Integer.toBinaryString(decimalValue);
    }

    public static String decimalToHex(int decimalValue) {
        return Integer.toHexString(decimalValue);
    }
}
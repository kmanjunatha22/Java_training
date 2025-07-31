package JavaBasicFundamental;

public class Literals {
    public static void main(String[] args) {
        /* In Java, literals are fixed values that are
          assigned to variables.These are constant values written directly in the
         code and represent different data types like int, float, char, boolean, String, etc.
        */
        int decimal = 100;
        int binary = 0b1101;
        int octal = 0144;
        int hex = 0x64;

        float pi = 3.14f;
        double gravity = 9.8;

        char letter = 'J';
        char unicodeChar = '\u004A';  // Unicode for 'J'

        String text = "Java is fun";
        boolean isCodingFun = true;

        String empty = null;

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        System.out.println("Letter: " + letter);
        System.out.println("Unicode Character: " + unicodeChar);
        System.out.println("Text: " + text);
        System.out.println("Is coding fun? " + isCodingFun);
        System.out.println("Empty: " + empty);

    }
}

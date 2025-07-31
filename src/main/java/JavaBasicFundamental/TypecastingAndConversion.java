package JavaBasicFundamental;

public class TypecastingAndConversion {
    public static void main(String[] args) {
        /*explicit and implicit*/
        double d = 9.78;
        int i = (int) d;    // Explicit casting: double to int

        System.out.println("Double: " + d);
        System.out.println("Converted int: " + i);

        int num = 100;
        long bigNum = num;        // int to long
        float decimal = bigNum;   // long to float

        System.out.println("int: " + num);
        System.out.println("long: " + bigNum);
        System.out.println("float: " + decimal);
    }
}

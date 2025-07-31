package ConditionalStatement;

public class IfelseIf {
    public static void main(String[] args) {
        // instantiating a variable declaration
        int x=8;
        int y=17;
        int z=6;
        //checking greatest value b/w 3 variables
        if (x>y && x>z) {
            System.out.println("x is greater: " + x);
        }else if (y>z && y>x) {
            System.out.println("y is graeter: "+y);
        }else
            System.out.println("z is greater: "+z);
    }
}

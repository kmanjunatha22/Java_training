package ConditionalStatement;

public class Ifelse {
    public static void main(String[] args) {
        // initiating a variable
        //a.
        int x=18;
        //setting a condition
        if (x>20)
            System.out.println("wellcome to the class");
        else System.out.println("goodbye we are done for today");

        //b.
        int y=12;
        if (y>10 && y<=20)
            System.out.println("goodbye");
        else
            System.out.println("wellcome home");

        //c. check greatest between x and y
        if (x>y)
            System.out.println("x is greater value: "+x);
        else
            System.out.println("y is greatest value : "+y);
    }
}

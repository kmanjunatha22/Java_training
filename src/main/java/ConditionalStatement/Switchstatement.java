package ConditionalStatement;

public class Switchstatement {
    public static void main(String[] args) {
        //switch statement ; is used when we have multiple cases and conditions and these keywords are;
        //Switch, case, break, and default
        // print days of the week based on below condition
        int n=4;
        switch (n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tueday");
                break;
            case 3:
                System.out.println("wendsday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");

            default:
                System.out.println("give valid value");
        }
    }
}

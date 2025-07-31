package assignmentsDay2;

public class Asg4_Even_Odd {
    public static void main(String[] args) {
        //use switch statement to check if a number is even or odd
        /*•	Declare an integer int num = 6;
•	Use a switch statement with (num % 2) to determine:
•	- If even → print "Even Number"
•	- If odd → print "Odd Number"
         */
        int num=6;
        switch (num % 2){
            case 0:
                System.out.println("Even Number");
                break;
            case 1:
                System.out.println("odd number");
            default:
                System.out.println("give valid number");
        }

    }
}

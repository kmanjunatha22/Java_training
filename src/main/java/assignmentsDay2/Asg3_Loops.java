package assignmentsDay2;

public class Asg3_Loops {
    public static void main(String[] args) {
        //print numbers 1 to 5 using three loop types
        //first For Loop
        System.out.print("For loop: ");
        for(int i=1;i<=5;i++){
           System.out.print(i+" ");
        }
        System.out.println(" ");
                                              // while loop
        System.out.print("While loop: ");
        int j=1;
        while(j<=5) {
            j++;
            System.out.print(j + " ");
        }                               //do_while loop
        System.out.println(" ");
        System.out.print("Do-While Loop: ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println();

    }
}

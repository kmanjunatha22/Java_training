package assignmentsDay2;
import java.util.Scanner;
public class Asg1_IfElse {
    public static void main(String[] args) {
        //pass/or Fail checker(IfElse)
        //Objective:use if else to check student result
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your score: ");
        int studentresult = scanner.nextInt();

       // int studentresult=35;
        if(studentresult>=50)
            System.out.println("passed "+studentresult);
        else
            System.out.println("fail "+studentresult);
    }
}

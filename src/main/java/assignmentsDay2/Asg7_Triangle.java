package assignmentsDay2;

public class Asg7_Triangle {
    public static void main(String[] args) {
        int rows = 4; // You can change the number of rows

        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for stars
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

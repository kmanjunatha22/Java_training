package assignmentsDay2;

public class Asg8_ReverseNumber {
    public static void main(String[] args) {
        //use while loop reverse a number
        int num=1234;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            num = num / 10;
        }
        System.out.println("Reversed num: "+reversed);

    }
}

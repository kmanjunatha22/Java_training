package JavaBasicFundamental;

public class Assignment3 {
    public static void main(String[] args) {
        double x=22.7;
        int y=4;
        // a. Cast x to int, then find (int)x % y
        int modulodiv=(int) x % y;
        System.out.println("(int)x%y: "+modulodiv);
       // b. Cast y to double and add to x
        double add=(double) y +x;
        System.out.println("x+(double)y: "+add);
        //c. Check if (int)x equals y * 5
        boolean result=(int) x == y*5;
        System.out.println("Is (int)x equal to y * 5? "+result);
        //d. Check if x > 20 AND y < 10
        boolean result1=x>20 && y<10;
        System.out.println("Is x > 20 and y < 10? "+result1);



    }
}

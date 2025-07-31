package JavaBasicFundamental;

public class Assignment2 {
    public static void main(String[] args) {
        int a=9;
        double b=4.0;
        double c=a;               //a.cast a to double and add to b
        double add=c+b;
        System.out.println("sum(a+b): "+add);
        double result=a/b;        //b.divide
        System.out.println("Division(a/b): "+result);
        boolean isGreater= a> (int) b; //c.cast b to int and compare if a>(int)b
        System.out.println("Is a>(int)b?"+isGreater);
        //d.Check if a is divisible by 3 AND b > 2.5
        boolean condition = (a % 3 == 0) && (b > 2.5);
        System.out.println("Is a divisible by 3 and b>2.5? "+condition);
    }
}

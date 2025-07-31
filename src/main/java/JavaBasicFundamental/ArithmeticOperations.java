package JavaBasicFundamental;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1=10;
        int num2=2;

        int sum=num1+num2;
        int sub=num1-num2;
        double div=num1/num2;
        int mul=num1*num2;
        double modulodiv=num2%num1;

        System.out.println("sum: "+sum);
        System.out.println("sub: "+sub);
        System.out.println("div: "+div);
        System.out.println("mul: "+mul);
        System.out.println("modulo div: "+modulodiv);

        //pre-increment
        int num3=num1++;
        System.out.println(num3);
        //post increment;
        int inc=++num2;
        System.out.println(inc);
    }
}

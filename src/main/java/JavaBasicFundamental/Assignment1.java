package JavaBasicFundamental;

public class Assignment1 {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int add=a+b;
        int sub=a-b;          /*a. add,sub,mul,div a&b*/
        int mul=a*b;
        int div=a/b;
        System.out.println("addition= "+add);
        System.out.println("subtraction= "+sub);
        System.out.println("multiplication= "+mul);
        System.out.println("division= "+div);
        boolean value=a>b;   //b compare if a is greater than b result is stored in value
        System.out.println("Is a greater than b? "+value);
        boolean result=a>b && b>0;  //c.logical AND operation
        System.out.println("Is a>b and b<0: "+result);
    }
}

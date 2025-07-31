package JavaBasicFundamental;

public class LogicalOperations {
    public static void main(String[] args) {
        /*logical operator is comparation b/w two operations
        example are OR,AND,Not
          */
        int x=7;
        int y=4;
        int a= 8;
        int b=10;
        boolean result=x>y && a>b;
        System.out.println(result);
        boolean result1=x>y || a<b;
        System.out.println(result1);
        boolean result2=x>y!=y>b;
        System.out.println(result2);
    }
}

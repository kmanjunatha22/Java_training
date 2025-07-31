package ConditionalStatement;

public class ForLoop {
    public static void main(String[] args) {
        // we have finite and infinite loop
        //finite loop: is a loop that a start and an end
        //infinite loop: is a loop that has no end because no condition or break is being declared or set.
        int i=1;
        //using while loop
        while(i<=4){
            System.out.println("hi "+i);
            //increment
            i++;
        }
        //using ForLoop increment
        for(int j=1;j<=5;j++){
            System.out.println("hi! you are highly to forloop exploration. "+j);
        }
        //using for decrement
        for(int z=4; z>=1;z--){
            System.out.println("thank you "+z);
        }

    }
}

package assignmentsDay2;

public class Asg2_Ifelse_If {
    public static void main(String[] args) {
        //Grade evaluator(if else if chain)
        //objective: assign grade based on score
        int score=73;
                                                               //A.if score>=90
        if(score >= 90)
            System.out.println("Grade: A");

                                                               //B.if 75<=score<90
        else if (75<=score && score<90) {
            System.out.println("Grade: B");

        }
                                                             //C.if 60<=score<75
        else if (60<=score && score<75) {
            System.out.println("Grade: C");
        }
                                                              //D.if score<60
        else if(score<60)
            System.out.println("Grade: D");
       /* else (score>=35)
            System.out.println("Fail");
        */
        int scor = 93;
        char grade;

        if (scor >= 90) {
            grade = 'A';
        } else if (scor >= 75) {
            grade = 'B';
        } else if (scor >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Grade: " + grade);


    }
}

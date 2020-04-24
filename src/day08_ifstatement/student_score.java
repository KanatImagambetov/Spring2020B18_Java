package day08_ifstatement;

public class student_score {
    public static void main(String[] args) {
        double score=98.5;
        boolean A= score>=90 && score<=100;
        boolean B=score>=80 && score<90;
        boolean C=score>=70 && score<80;
        boolean E=score>=60 && score<70;
// String grade=" "
        char grade=' ';

        if (A){
            grade='A';

        }else if(B){
            grade='B';

        }else if(C){
            grade='C';
        }else if(E){
            grade='E';
        }else{
            grade='F';
        }

        System.out.println("Score "+score+" is: "+grade);





    }




}

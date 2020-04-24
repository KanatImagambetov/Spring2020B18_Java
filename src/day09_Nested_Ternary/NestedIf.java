package day09_Nested_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        boolean UScitizen=true;
        int age=19;

        if(UScitizen){

            if(age>17){
                System.out.println("you are eligible to vote");
            }else{
                System.out.println("Grow up first");
            }
        }else{
            System.out.println("Only US citizen is eligible to vote");
        }


        System.out.println("============================================================");

        int score=9;
        String grade="";
        //int validscore=50;

        if(score>0 && score<=100){
            if(score>=90){
                grade="Excellence";
            }else if(score>=80) {
                grade = "Good";
            }else if(score>=70){
                grade="Merit";
            }else if(score>=60){
                grade="Fair";
            }else if(score>=50){
                grade="Pass";
            }else{
                grade="Failed";
            }
        } else {
         grade = "Invalid";
        }

        System.out.println(grade);

        System.out.println("=====================================");

        int score2=715;
        String grade2="";

        if(score2>0 && score2<=100){
            grade2=(score2>=90) ? "Excellence" : (score2>=80) ? "Good": (score2>=70) ? "Merit" : (score2>=60) ? "Fair" : (score2>=50) ? "Pass" : "Failed";
        }else{
            grade2="Invalid";
        }
        System.out.println(grade2);

        System.out.println("=========================================================");
        int salary=35000;
        int exp=8;
       // String result="";

        if(salary>=30000){
            if(exp>=2){
                System.out.println("eligible for the loan");
            }else{
                System.out.println("no eligible for the loan");
            }
        }else{
            System.out.println("NOT qualified");
            }

        System.out.println("=========================================================");
        int salary1=39000;
        int exp1=1;
        String result1="";

        if(salary1>=30000){
            if(exp1>=2){
                result1="eligible for the loan";
            }else{
                result1="no eligible for the loan";
            }
        }else{
            result1="NOT qualified";
        }
        System.out.println(result1);





    }


}

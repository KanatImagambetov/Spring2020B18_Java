package day09_Nested_Ternary;

public class moreternarypractice {
    public static void main(String[] args) {
       // char ch1='+';
        // System.out.println(ch1);
        int num=100;
        char ch1=' ';

        if(num>0){
            ch1='a';
        }else if(num<0) {
            ch1 = '-';
        }else{
            ch1='0';
        }

        System.out.println(ch1);

        char ch2=(num>0) ? '+' : (num<0) ? '-' : '0';

        System.out.println(ch2);

        System.out.println(ch1+ch2);
        System.out.println("=====================================");
        byte score=75;
        String grae="";
        if(score>=90 && score<=100){
            grae="A";
        }else if(score>=80 && score<90){
            grae="B";
        }else if(score>=70 && score<80) {
            grae = "C";
        }else if(score>=60 && score<70) {
            grae = "D";
        }else if(score<60 && score>0) {
            grae = "Fail";
        }else{
            grae="invalid";
        }

        System.out.println(grae);

        String grade=(score>=90 && score<=100) ? "A" : (score>=80 && score<90) ? "B" : (score>=70 && score<80) ? "C" :
                (score>=60 && score<70) ? "D" : (score<60 && score>0) ? "Fail" : "invalid";

        System.out.println(grade);








    }

}

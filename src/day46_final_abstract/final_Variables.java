package day46_final_abstract;

public class final_Variables {
    public static void main(String[] args) {
        final double PI=3.14;

        final String gender="Male";

        final int score;

        score=200;
      //  score=300;

        int InstanceVariable=300;

        System.out.println(score);

        System.out.println("==================================");

        final_Variables obj=new final_Variables();
       // obj.InstanceVariable=400;

    }
}

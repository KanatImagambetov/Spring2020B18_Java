package day09_Nested_Ternary;

public class ternaryu2 {
    public static void main(String[] args) {
        String res="";

        if(9<10){
            res="9 is greater";
        }else {
            res = "10 is greater";
        }


        String res2=(9<10) ? "9 is greater" : "10 is greater";

        System.out.println(res);
        System.out.println(res2);
        System.out.println("========================================");
        int age=1;
        boolean elig;

        if(age>=21) {
            elig = true;
        }else{
            elig=false;
        }
        System.out.println(elig);

        boolean elig2=(age>=21) ? true : false;

        System.out.println(elig2);

        System.out.println("====================================================");

        int ageofperson=20;

        String elitovote="";

        if(ageofperson>18){
            elitovote="Yes";
        }else{
            elitovote="No";
        }

        String elitovote2= (ageofperson>18) ? "YES" : "NO";

        System.out.println(elitovote);
        System.out.println(elitovote2);




    }


}

package day09_Nested_Ternary;

public class AgeGroupNestedIf {
    public static void main(String[] args) {
        /*
        age valid negative or greater 150
        age:
        teen <21
        adult >21 <55
        senior >55
         */

        int age =0;
        String result="";

        if(age>=0 && age<=150){
            if(age<21){
                result="Teenager";
            }else if(age <55){
                result="Adult";
            }else{
                result="Senior";
            }
        }else{
            result="Invalid entry";
        }
        System.out.println(result);
        System.out.println("=======================================");
        int age1 =100;
        String result1="";

        if(age1>=0 && age1<=150){
           /* if(age1<21){
                result1="Teenager";
            }else if(age1 <55){
                result1="Adult";
            }else{
                result1="Senior";
            }

            */
           result1=(age1<21) ? "Teenager" : (age1 <55) ? "Adult" : "Senior";

        }else{
            result1="Invalid entry";
        }
        System.out.println(result1);





    }

}

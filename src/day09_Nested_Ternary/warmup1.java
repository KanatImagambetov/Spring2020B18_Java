package day09_Nested_Ternary;

public class warmup1 {
    public static void main(String[] args) {
        //       int age=1;

        //    boolean infant= age==0 && age<1;
        //    boolean toddler= age>=1 && age<=5;
        //    boolean kid= age>=6 && age<=9;
        //    boolean PreTeen= age>=10 && age<=12;
/*
                   Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */
        int age=40;
        String agegroup="";

        if(age<3 && age>0){
            agegroup="Baby";
        }else if(age>=3 && age<=5) {
            agegroup = "Toddler";
        }else if(age>=6 && age<=9) {
            agegroup = "Kid";
        }else if(age>=10 && age<=12) {
            agegroup = "Pre-teen";
        }else if(age>=13 && age<=17) {
            agegroup = "Teenager";
        }else if(age>=18 && age<=20) {
            agegroup = "Young Adult";
        }else if(age>=21 && age<=39) {
            agegroup="Adult";
        }else if(age>=40 && age<=49) {
            agegroup = age+"\n"+"Young Middle-Aged Adult";
        }else if(age>=50 && age<=54) {
            agegroup = " Middle-Aged Adult";
        }else if(age>=55 && age<=64) {
            agegroup = "Very Young Senior Citizen";
        }else if(age>=65 && age<=74) {
            agegroup = "Young Senior Citizen";
        }else if(age>=75 && age<=84) {
            agegroup = "Senior Citizen";
        }else if(age>=85 && age<=150) {
            agegroup = "Old Senior Citizen";
        }else{
            agegroup="invalid entry";
        }
               System.out.println(agegroup);


        boolean elgibletoBuy= agegroup=="Adult" || agegroup=="Young Senior Citizen" || agegroup=="Young Middle-Aged Adult";

        if(elgibletoBuy) {
            System.out.println("you can sell alcohol");
        }else{
            System.out.println("you can NOT sell");
        }

    }


}

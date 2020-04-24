package day10_Siwtch_Scanner;
/*	2. write a program that can display the days based on the numbers 1 ~ 7

			MUST USE NESTED IF

 */
public class warmup {
    public static void main(String[] args) {
        int num = 5;

        if (num > 1 && num < 8) {
            if (num == 1) {
                System.out.println("Monday");
            } else if (num == 2) {
                System.out.println("Tuesday");
            } else if (num == 3) {
                System.out.println("Wendesday");
            } else if (num == 4) {
                System.out.println("Thursday");
            } else if (num == 5) {
                System.out.println("Friday");
            } else if (num == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("invalid");
        }
        System.out.println("===============================================");
     //   int num3=2;
        String res3="";

        if(num>=1 && num<=7){
            res3=(num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wendesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday": (num == 6) ? "Saturday" : "Sunday";
        }else{
            res3="invalid";
        }


        System.out.println(res3);



        System.out.println("================================================");
/*
write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

				DO NOT USE IF STATEMENTS
 */

        int num1=8;
        String result="";
        if(num1>1 && num1<9){
             result=(num1==1) ? "one" : (num1==2) ? "two" : (num1==3) ? "three" : (num1==4) ? "four" : (num1==5) ?
                    "five" : (num1==6) ? "six" : (num1==7) ? "seven" : (num1==8) ? "eight" : "nine";

        }else{
            result="Invalid";
        }


        System.out.println(result);

        System.out.println("============================================");
/*
write a program that can fi1`nd the number of days in a month
	 	(Assume that Feb has 28 days)

		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12

	 		MUST USE NESTED IF
 */
                int month=2;
                String daymonth="";

                if(month>=1&&month<=12){
                    if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                        daymonth="31";
                    }else if(month==4 || month==6 || month==9 || month==11){
                        daymonth="30";
                    }else if(month==2){
                        daymonth="28";
                    }else{
                        daymonth="Invalid";
                    }
                }else{
                    daymonth="no exist";
                }

        System.out.println(daymonth);

        if(month>=1&&month<=12){
            daymonth=(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) ? "31":
            (month==4 || month==6 || month==9 || month==11) ? "30": "28";
            }else{
                daymonth="Invalid";
            }
        System.out.println(daymonth);



    }
}

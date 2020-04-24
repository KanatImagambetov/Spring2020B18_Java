package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formating {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime num1= LocalTime.of(16,30,20);
        System.out.println(num1.format(dtf));

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime num2= LocalTime.of(16,30,20);
        System.out.println(num2.format(dtf1));

        boolean res=num1.isAfter(num2);
        System.out.println(res);
    }
}

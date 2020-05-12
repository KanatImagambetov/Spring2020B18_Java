package day36_StaticBlock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class repl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }
    public static void timeConversion(String s) {
        String hour=s.substring(0,2);
        String minute=s.substring(3,5);
        String second=s.substring(6,8);
        String time=s.substring(8,10);
        int hour1=Integer.parseInt(hour);

        if(time.equals("PM")){
            hour1=hour1+12;
        }
        int minute1=Integer.parseInt(minute);
        int second1=Integer.parseInt(second);

        LocalTime num1= LocalTime.of(hour1,minute1,second1);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(num1.format(dtf1));
    }
}

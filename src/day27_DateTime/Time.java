package day27_DateTime;
import java.time.LocalDate;
public class Time {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);
        LocalDate date2=LocalDate.of(2020,12,25);
        System.out.println(date2);
        boolean res=date1.isAfter(date2);
        System.out.println(res);

        boolean res1=date1.isBefore(date2);
        System.out.println(res1);

        boolean res2=date1.isEqual(date2);
        System.out.println(res2);

        boolean res3=date2.isLeapYear();
        System.out.println(res3);

        System.out.println("=========================================");

        LocalDate now=LocalDate.now();
        System.out.println("Today is: "+now);

        LocalDate bd=LocalDate.of(1990, 04, 25);

        int month=bd.getMonthValue();
        int day=bd.getDayOfMonth();

        System.out.println(month);
        System.out.println(day);

        String str=now.toString();
        System.out.println(str.replace("-"," "));

    }


}

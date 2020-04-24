package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocaLTD {
    public static void main(String[] args) {
        LocalDateTime da=LocalDateTime.of(2020,10,20,20,40,50);
        System.out.println(da);

        LocalDateTime da1=LocalDateTime.now();
        System.out.println(da1);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEEE hh:mm a  yyyy-MMMM-dd");

        System.out.println(da.format(dtf1));

        LocalDate date=LocalDate.of(2000, 10,3);
        LocalTime time=LocalTime.of(2, 10,3);
        LocalDateTime full=LocalDateTime.of(date, time);
        System.out.println(full);

    }
}

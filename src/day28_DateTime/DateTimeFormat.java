package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime datetime1=LocalDateTime.of(2014,12,3,20,23,43);

        DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd/MMM/yyyy  EEE  HH:mm");
        System.out.println(datetime1.format(dft));

    }
}

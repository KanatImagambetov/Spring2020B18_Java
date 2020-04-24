package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MMM/dd");

    LocalDate date1=LocalDate.now();
    System.out.println(date1.format(dtf));

    DateTimeFormatter dft2=DateTimeFormatter.ofPattern("EEEE MMMM/dd/yyyy");
    LocalDate date2=LocalDate.of(1999,5,9);
    System.out.println(date2.format(dft2));
    }
}

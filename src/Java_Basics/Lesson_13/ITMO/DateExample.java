package Java_Basics.Lesson_13.ITMO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);
//        Date date2 = new Date(0);
//        System.out.println(date2);
//        double years = (date.getTime() - date2.getTime())/1000.0/60/60/24/365;
//        System.out.println(new DecimalFormat("#.##").format(years));
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        System.out.println(calendar);
//
//        Calendar calendar2 = Calendar.getInstance();
//        System.out.println(calendar2);
//
        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);

        System.out.println(date);
        LocalDateTime someDay = LocalDateTime.of(2015,5,3,12,15,30);
//        System.out.println(someDay);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));

        System.out.println(someDay.format(DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd")));

        LocalDate someDate = localDate.plusMonths(50);
        System.out.println(someDate);

        Period period = Period.between(localDate, someDate);
        System.out.println(period.getYears());
    }
}

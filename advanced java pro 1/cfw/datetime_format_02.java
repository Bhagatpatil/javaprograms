package cfw;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetime_format_02 {
    public static void main(String[] args) {
        LocalDateTime td = LocalDateTime.now();

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(td);
        System.out.println(myDate);

        LocalTime time = LocalTime.now();
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + ":" + time.getNano());
    }
}

/*in the program use localdate and local time instance and print current date and time   */
package cfw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_api_01 {
    public static void main(String[] args) {
        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

    }
}

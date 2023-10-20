/*in the program use a Datetimeformatter and print any format
 *
 */
package cfw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_format_01 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);// print current time and date

        DateTimeFormatter td = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(td);
        System.out.println("date-month-year : " + myDate);// print date and time by any format like this date-month-year

        DateTimeFormatter tt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = dt.format(tt);
        System.out.println("month/date/year : " + date);// print date and time by any format like this month/date/year

        DateTimeFormatter dd = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        String ti = dt.format(dd);
        System.out.println("year|month|date : " + ti);// print date and time by any format like this year|month|date

    }
}

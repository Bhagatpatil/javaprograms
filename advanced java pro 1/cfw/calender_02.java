/*in the program use inbiled Calnder abstract class
 * and print available calandar in java
 * and print timezone
 * and print timezone ID
 * and current time
 */
package cfw;

import java.util.Calendar;

public class calender_02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getAvailableCalendarTypes());
        System.out.println(c.getCalendarType());
        System.out.println("current timezone is  : " + c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}

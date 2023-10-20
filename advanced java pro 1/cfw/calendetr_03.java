/*in the program use calendar and GregorianCalendar and print date hour etc..
 * and print list of timezone in world
 * Calendar is Abstract class
 * and print argument year is leap yes or not
 */
package cfw;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calendetr_03 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println("current date : " + cal.get(Calendar.DATE));
        System.out.println("current hour : " + cal.get(Calendar.HOUR));
        System.out.println("current minute : " + cal.get(Calendar.MINUTE));
        System.out.println("current second : " + cal.get(Calendar.SECOND));
        System.out.println("current relway time : " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

        System.out.println("\n*********************************************************\n");

        GregorianCalendar c = new GregorianCalendar();
        System.out.println(c.isLeapYear(2016));
        System.out.println(c.isLeapYear(2023));


        System.out.println("\nbelow list is timezone in world\n");
        for (int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}

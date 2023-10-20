/*in the program use abstract calendar class
 * and print calendar type in java
 */
package cfw;

import java.util.Calendar;

public class calender_01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("type of calender in java : " + c.getAvailableCalendarTypes());
        System.out.println("calendar type of word : " + c.getCalendarType());
    }
}

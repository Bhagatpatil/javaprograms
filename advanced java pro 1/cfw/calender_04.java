package cfw;

import java.util.Calendar;

public class calender_04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}

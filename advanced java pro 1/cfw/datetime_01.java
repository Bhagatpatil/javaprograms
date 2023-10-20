package cfw;

import java.time.LocalDateTime;

public class datetime_01 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);
        System.out.println(d.getHour() + ":" + d.getMinute() + ":" + d.getSecond());
    }
}

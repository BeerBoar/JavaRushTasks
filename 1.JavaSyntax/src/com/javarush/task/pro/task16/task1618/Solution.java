package com.javarush.task.pro.task16.task1618;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* 
Лишь бы не запутаться
*/

public class Solution {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Europe/Paris");
        ZoneId zone2 = ZoneId.of("Australia/Darwin");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
        LocalDateTime time1 = changeZone1(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time1);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime time1 = ZonedDateTime.of(fromDateTime,fromZone);
        LocalDateTime time2 = time1.withZoneSameInstant(toZone).toLocalDateTime();
        return time2;
    }
    static LocalDateTime changeZone1(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime zonedDateTime = fromDateTime.atZone(fromZone);
        int sec1 = zonedDateTime.getOffset().getTotalSeconds();
        int sec2 = LocalDateTime.now().atZone(toZone).getOffset().getTotalSeconds();
        int sec = sec2 - sec1;
        return zonedDateTime.toLocalDateTime().plusSeconds(sec);
    }
}

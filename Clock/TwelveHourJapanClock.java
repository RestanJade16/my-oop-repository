package com.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TwelveHourJapanClock extends GeneralTime{

    DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("hh:mm:ss a");
    @Override
    public void time() {
        LocalDateTime now = LocalDateTime.now();//getting current time.
        System.out.println("Japan 12-Hour Time: " + militaryTime.format(now.plusHours(2)));
    }
}

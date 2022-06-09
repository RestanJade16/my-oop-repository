package com.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NormalClock extends GeneralTime {
    DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void time() {
        LocalDateTime now = LocalDateTime.now();//getting current time.
        System.out.println("Normal Time: "+militaryTime.format(now));
    }
}

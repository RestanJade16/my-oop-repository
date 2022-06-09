package com.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class NormalClock extends GeneralTime {

    DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("hh:mm");

    @Override
    public void time() {
        LocalDateTime now = LocalDateTime.now();//getting current time.
        System.out.println("Normal Time: "+militaryTime.format(now));
    }
}

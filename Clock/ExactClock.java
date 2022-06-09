package com.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExactClock extends GeneralTime{

    DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH:mm:ss:ms");
    @Override
    public void time() {
        LocalDateTime now = LocalDateTime.now();//getting current time.
        System.out.println("Exact Time: "+militaryTime.format(now));
    }
}

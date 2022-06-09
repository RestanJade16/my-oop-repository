package com.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MilitaryTime extends GeneralTime{

    DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH:mm");
    @Override
    public void time() {
            LocalDateTime now = LocalDateTime.now();//getting current time.
            System.out.println("Military Time: "+militaryTime.format(now));
        }

}

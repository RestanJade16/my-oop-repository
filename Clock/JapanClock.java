package com.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JapanClock extends GeneralTime{

    DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    @Override
    public void time() {
       LocalDateTime now = LocalDateTime.now();//getting current time.
        System.out.println("Japan Time: "+militaryTime.format(now.plusHours(2)));
    }
}

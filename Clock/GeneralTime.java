package com.Clock;

import java.time.format.DateTimeFormatter;

public abstract class GeneralTime {

    DateTimeFormatter defaultTime = DateTimeFormatter.ofPattern("HH:mm");

    public void setDefaultTime(DateTimeFormatter defaultTime) {
        this.defaultTime = defaultTime;
    }

    public DateTimeFormatter getDefaultTime() {
        return defaultTime;
    }

    public abstract void time();


}

package com.Clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RomanNumeralClock extends GeneralTime{


      public static void integerToRoman(int num) {

     int[] values = {40,10,9,5,4,1};
        String[] romanLiterals = {"XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println("Hours in Roman Numeral: " + roman.toString());
    }



    @Override
    public void time() {
        DateTimeFormatter militaryTime = DateTimeFormatter.ofPattern("HH");
        LocalDateTime now = LocalDateTime.now();
        integerToRoman(now.getHour());

    }
}

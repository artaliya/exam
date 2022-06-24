package com.exam.exam.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeServiceImpl implements DateTimeService {
    private final static String HOURS_MINUTES = "HH:mm";
    private final static String HOURS_MINUTES_QUOTED = "\"HH:mm\"";
    private final static String HOURS_MINUTES_SECONDS = "HH:mm:ss";
    private final static String HOURS_MINUTES_SECONDS_QUOTED = "\"HH:mm:ss\"";

    @Override
    public String getToday() {
        LocalDate now = LocalDate.now();
        return now.toString();
    }

    @Override
    public String getNowTime(String format) {
        LocalDateTime myDateObj = LocalDateTime.now();

        DateTimeFormatter myFormatObj;

        if (format.equals(HOURS_MINUTES_QUOTED)) {
            myFormatObj = DateTimeFormatter.ofPattern(HOURS_MINUTES);
            return myDateObj.format(myFormatObj);
        } else if (format.equals(HOURS_MINUTES_SECONDS_QUOTED)) {
            myFormatObj = DateTimeFormatter.ofPattern(HOURS_MINUTES_SECONDS);
            return myDateObj.format(myFormatObj);
        }

        return null;
    }
}

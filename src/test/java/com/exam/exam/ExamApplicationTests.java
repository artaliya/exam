package com.exam.exam;

import com.exam.exam.service.DateTimeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExamApplicationTests {
    private final static String HOURS_MINUTES = "HH:mm";
    private final static String HOURS_MINUTES_QUOTED = "\"HH:mm\"";
    private final static String HOURS_MINUTES_SECONDS = "HH:mm:ss";
    private final static String HOURS_MINUTES_SECONDS_QUOTED = "\"HH:mm:ss\"";
    @Autowired
    private DateTimeService dateTimeService;
    @Test
    void timeSecondsTest() {

        LocalDateTime expected = LocalDateTime.now();
        DateTimeFormatter myFormatObj = null;
        myFormatObj = DateTimeFormatter.ofPattern(HOURS_MINUTES);


        assertEquals(expected.format(myFormatObj), dateTimeService.getNowTime(HOURS_MINUTES_QUOTED));
    }

    @Test
    void timeTest() {
        LocalDateTime expected = LocalDateTime.now();
        DateTimeFormatter myFormatObj = null;
        myFormatObj = DateTimeFormatter.ofPattern(HOURS_MINUTES_SECONDS);


        assertEquals(expected.format(myFormatObj), dateTimeService.getNowTime(HOURS_MINUTES_SECONDS_QUOTED));
    }

    @Test
    void dateTest() {
        String expected = LocalDate.now().toString();

        String actual = dateTimeService.getToday().toString();
        assertEquals(expected, actual);

    }


}

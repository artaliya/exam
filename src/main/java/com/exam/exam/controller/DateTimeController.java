package com.exam.exam.controller;

import com.exam.exam.service.DateTimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DateTimeController {

    private final DateTimeService dateTimeService;

    public DateTimeController(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    @GetMapping("/today")
    public String getToday() {
        return dateTimeService.getToday();
    }

    @GetMapping("/now")
    public String getNowTime(@RequestParam String format) {
        System.out.println(format);
        return dateTimeService.getNowTime(format);
    }
}

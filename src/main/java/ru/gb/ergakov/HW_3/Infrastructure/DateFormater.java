package ru.gb.ergakov.HW_3.Infrastructure;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
public class DateFormater {

    final static DateTimeFormatter customFormater = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDate StringToLocalDateTime(String text) {
        return LocalDate.parse(text, customFormater);
    }
}

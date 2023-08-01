package com.company;

import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

public class DateTimeFormatter {
    private static final DateTimeFormatter ISO_LOCAL_DATE = null;

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        java.time.format.DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

    }

    private static java.time.format.DateTimeFormatter ofPattern(String string) {
        return null;
    }
}

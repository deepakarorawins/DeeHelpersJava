package com.deesite.files;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UniqueFileNameUsingLocalDate {
    public static LocalDate localDate;
    public static LocalDateTime localDateTime;
    public static void main(String[] args) {
        String uniqueFileName = getCurrentLocalDateTime()
                .toString()
                .replace("-", "_")
                .replace(":", "_")
                .replace(".", "_");
        System.out.println(getCurrentLocalDateTime());
        System.out.println(uniqueFileName);
    }

    public static LocalDateTime getCurrentLocalDateTime() {
        localDateTime = LocalDateTime.now();
        return localDateTime;
    }
}

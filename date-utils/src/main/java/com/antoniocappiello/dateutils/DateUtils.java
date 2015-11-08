package com.antoniocappiello.dateutils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String getTime(Date date) {
        SimpleDateFormat timeFormatter = new SimpleDateFormat("kk:mm");
        return timeFormatter.format(date);
    }
}

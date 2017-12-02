package com.kpgn.androidtemplate.utility;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class DateTimeUtil {

    private static final String DATE_FORMATTER_STRING = "EEE, d MMM yyyy HH:mm:ss";
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_FORMATTER_STRING, Locale.US);

    public static String getFormattedDateTime(long longTime) {
        try {
            return SIMPLE_DATE_FORMAT.format(new Date(longTime));
        } catch (Exception e) {
            Log.w(DateTimeUtil.class.getCanonicalName(), e.getLocalizedMessage());
        }
        return "";
    }
}
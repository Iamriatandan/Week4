package com.day5.junit.advancedproblems.dateformatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatter {

    public String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        return outputFormat.format(inputFormat.parse(inputDate));
    }
}

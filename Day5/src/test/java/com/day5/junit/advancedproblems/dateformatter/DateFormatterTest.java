package com.day5.junit.advancedproblems.dateformatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {

    @Test
    public void testValidDate() throws ParseException {
        DateFormatter formatter = new DateFormatter();
        assertEquals("25-12-2021", formatter.formatDate("2021-12-25"));
    }

    @Test
    public void testInvalidDate() {
        DateFormatter formatter = new DateFormatter();
    }
}


package com.day5.regex.basicregexproblem.validhexcolourcode;
import static org.junit.jupiter.api.Assertions.*;

import com.day5.regex.basicregexproblems.validhexcolourcode.ValidHexCode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidHexCodeTest {
    @BeforeEach
    void start(){
        System.out.println("Starting a new Test");
    }

    @AfterEach
    void end(){
        System.out.println("Test done");
    }

    //Test for valid code
    @Test
    void validHexCode(){
        assertTrue(ValidHexCode.validHexCode("#AF1236"));
        assertTrue(ValidHexCode.validHexCode("#ab9999"));
    }

    //Test for invalid code
    @Test
    void invalidHexCode(){
        //Very short code
        assertFalse(ValidHexCode.validHexCode("#123"));
        //non in range
        assertFalse(ValidHexCode.validHexCode("#GGGGGG"));
        //not in range with > f
        assertFalse(ValidHexCode.validHexCode("#AZ1342"));
        //Without #
        assertFalse(ValidHexCode.validHexCode("FFA500"));
        //characters less than 6
        assertFalse(ValidHexCode.validHexCode("#12345"));
        //characters more than 6
        assertFalse(ValidHexCode.validHexCode("#1234567"));
    }
}

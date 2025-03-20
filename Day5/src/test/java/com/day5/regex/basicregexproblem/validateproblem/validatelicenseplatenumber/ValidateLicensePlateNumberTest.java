package com.day5.regex.basicregexproblem.validateproblem.validatelicenseplatenumber;
import static org.junit.jupiter.api.Assertions.*;

import com.day5.regex.basicregexproblems.validationproblems.validatealicenseplatenumber.ValidateALisencePlateNumber;
import org.junit.jupiter.api.Test;
public class ValidateLicensePlateNumberTest {

    //for valid license plates
     @Test
    void testValidLicensePlates(){
        assertTrue(ValidateALisencePlateNumber.validate("AZ1234"));
        assertTrue(ValidateALisencePlateNumber.validate("RM1235"));
    }

    //for invalid license plates
@Test
    void testInvalidNumberPlates(){
    // Only one letter
    assertFalse(ValidateALisencePlateNumber.validate("A12345"));
    // Three letters
    assertFalse(ValidateALisencePlateNumber.validate("ABC123"));
    // Only two digits
    assertFalse(ValidateALisencePlateNumber.validate("AB12"));
    // Digits before letters
    assertFalse(ValidateALisencePlateNumber.validate("1234AB"));
    // Lowercase letters
    assertFalse(ValidateALisencePlateNumber.validate("ab1234"));

}
//for null values
@Test
    void testWithNullValues(){
         assertFalse(ValidateALisencePlateNumber.validate(" "));
}
}

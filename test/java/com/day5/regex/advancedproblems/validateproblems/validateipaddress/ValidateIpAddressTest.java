package com.day5.regex.advancedproblems.validateproblems.validateipaddress;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateIpAddressTest {


        // Test setup before each test
        @BeforeEach
        void setup() {
            System.out.println("Test Started");
        }

        // Cleanup after each test
        @AfterEach
        void cleanUp() {
            System.out.println("Test executed smoothly");
        }

        // Test method to validate valid IP addresses
        @Test
        void testValidIPAddress() {
            // Test cases for valid IP addresses
            String validIp1 = "192.168.1.1";
            String validIp2 = "255.255.255.255";

            // Assert that the IP addresses are valid
            assertTrue(ValidateIpAddress.isValidIPAddress(validIp1), "IP " + validIp1 + " should be valid.");
            assertTrue(ValidateIpAddress.isValidIPAddress(validIp2), "IP " + validIp2 + " should be valid.");
        }

        // Test method to validate invalid IP addresses
        @Test
        void testInvalidIPAddress() {
            // Test cases for invalid IP addresses
            String invalidIp1 = "256.100.50.25"; // Exceeds 255 in the first octet
            String invalidIp2 = "192.168.01.1";  // Contains leading zero in the second octet
            String invalidIp3 = "192.168.1";    // Missing one octet

            // Assert that the IP addresses are invalid
            assertFalse(ValidateIpAddress.isValidIPAddress(invalidIp1), "IP " + invalidIp1 + " should be invalid.");
        }

        // Test method for case when the IP address has leading zeros in the first octet
        @Test
        void testLeadingZeroInOctet() {
            // Test case where an octet has leading zeros
            String ipWithLeadingZero = "192.168.01.1";

           }

        // Test method for incomplete IP address
        @Test
        void testIncompleteIPAddress() {
            // Test case for an incomplete IP address
            String incompleteIp = "192.168.1";

            // Assert that the IP address is invalid
            assertFalse(ValidateIpAddress.isValidIPAddress(incompleteIp), "IP " + incompleteIp + " should be invalid due to missing octets.");
        }
    }


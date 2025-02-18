package com.day5.junit.advancedproblems.temperatureconverter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

        @Test
        public void testCelsiusToFahrenheit() {
            TemperatureConverter converter = new TemperatureConverter();
            assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
            assertEquals(100.4, converter.celsiusToFahrenheit(38), 0.001);
        }

        @Test
        public void testFahrenheitToCelsius() {
            TemperatureConverter converter = new TemperatureConverter();
            assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
            assertEquals(38, converter.fahrenheitToCelsius(100.4), 0.001);
        }
    }
    
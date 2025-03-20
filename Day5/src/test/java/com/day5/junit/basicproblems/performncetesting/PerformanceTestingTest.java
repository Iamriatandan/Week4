package com.day5.junit.basicproblems.performncetesting;

import com.day5.junit.basicproblems.performancetesting.PerformanceTesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTestingTest {

    private final PerformanceTesting obj = new PerformanceTesting();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test fails if execution exceeds 2 seconds
    public void testLongRunningTask() throws InterruptedException {
        obj.longRunningTask(); // Should fail if execution exceeds 2 seconds
    }
}

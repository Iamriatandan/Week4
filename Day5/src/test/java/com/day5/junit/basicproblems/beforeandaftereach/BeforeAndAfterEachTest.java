package com.day5.junit.basicproblems.beforeandaftereach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAndAfterEachTest {

        private final BeforeAndAfterEach obj = new BeforeAndAfterEach();

        @BeforeEach
        public void setUp() {
            obj.connect();
        }

        @AfterEach
        public void tearDown() {
            obj.disconnect();
        }

        @Test
        public void testConnection() {
            // Assuming connect() and disconnect() are working correctly
        }
    }

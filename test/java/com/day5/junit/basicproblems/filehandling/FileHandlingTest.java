package com.day5.junit.basicproblems.filehandling;
import static org.junit.jupiter.api.Assertions.*;

import com.day5.junit.basicproblems.filehandlingmethods.FileHandling;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

public class FileHandlingTest {
        private final FileHandling fileProcessor = new FileHandling();
        private final String filename = "testfile.txt";

        @Test
        public void testWriteAndReadFile() throws IOException {
            String content = "Hello, world!";
            fileProcessor.writeToFile(filename, content);
            String result = fileProcessor.readFromFile(filename);
            assertEquals(content, result);
        }

        @Test
        public void testFileExistsAfterWriting() throws IOException {
            fileProcessor.writeToFile(filename, "Test content");
            File file = new File(filename);
            assertTrue(file.exists());
        }

        @Test
        public void testIOExceptionHandling() {
            assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistentfile.txt"));
        }
    }
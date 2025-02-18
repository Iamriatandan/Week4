package com.day5.junit.basicproblems.filehandlingmethods;
import java.io.*;
public class FileHandling {

        public void writeToFile(String filename, String content) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write(content);
            }
        }

        public String readFromFile(String filename) throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                return reader.readLine();
            }
        }
    }
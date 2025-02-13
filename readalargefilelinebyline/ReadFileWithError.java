package readalargefilelinebyline;
import java.io.*;
public class ReadFileWithError {
        public static void main(String[] args) {
            // Path to the large text file
            String filePath = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\readalargefilelinebyline\\largeFile.txt";

            // Calling the method to read the file and print lines with "error"
            readFileAndPrintErrors(filePath);
        }

        public static void readFileAndPrintErrors(String filePath) {
            // Using BufferedReader for efficient reading of large files
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;

                // Reading the file line by line
                while ((line = br.readLine()) != null) {
                    // Check if the line contains the word "error" (case insensitive)
                    if (line.toLowerCase().contains("error")) {
                        // Print the line if it contains the word "error"
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                // Handle potential exceptions such as file not found
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }

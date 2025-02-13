package filterstreams;
import java.io.*;
public class UpperCaseToLowerCase {
    public static void convertFileToLowercase(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Read the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase
                String lowerCaseLine = line.toLowerCase();
                // Write the converted line to the output file
                writer.write(lowerCaseLine);
                writer.newLine(); // To add a newline after each line
            }

            System.out.println("File converted to lowercase successfully.");

        } catch (IOException e) {
            System.err.println("Error while processing the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Path to the input and output files
        String inputFile = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\filterstreams\\input.txt";  // Replace with your input file path
        String outputFile = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\filterstreams\\Output.txt"; // Replace with your output file path

        // Convert the file to lowercase
        convertFileToLowercase(inputFile, outputFile);
    }

}

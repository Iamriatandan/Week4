package readuserinputfromconsole;
import java.io.*;
public class ReadUserInputFromConsole {
    public static void main(String[] args) {
        // Create a BufferedReader for console input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Ask for user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write the information to a file
            try (FileWriter writer = new FileWriter("C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\readuserinputfromconsole\\writeFromConsole.txt", true)) { // Appends data
                writer.write("Name: " + name + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Favorite Language: " + language + "\n");
                writer.write("----------------------\n");
                System.out.println("User information saved successfully in 'writeFromConsole'.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

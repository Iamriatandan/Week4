package datastreams;
import java.io.*;
public class StudentDataStream {
    // Method to store student details in a binary file
    public static void storeStudentData(String filename) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            // Store student details
            dos.writeInt(138); // Roll number (int)
            dos.writeUTF("Ria"); // Name (String)
            dos.writeDouble(8.6); // GPA (double)

            dos.writeInt(139); // Roll number (int)
            dos.writeUTF("Rimjhim"); // Name (String)
            dos.writeDouble(9.4); // GPA (double)

            dos.writeInt(184); // Roll number (int)
            dos.writeUTF("Srijan"); // Name (String)
            dos.writeDouble(8.3); // GPA (double)

            System.out.println("Student data written to file successfully.");

        } catch (IOException e) {
            System.err.println("Error during writing student data: " + e.getMessage());
        }
    }

    // Method to retrieve and display student details from the binary file
    public static void retrieveStudentData(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            // Read and display student details
            while (dis.available() > 0) {
                int rollNumber = dis.readInt(); // Read roll number
                String name = dis.readUTF(); // Read name
                double gpa = dis.readDouble(); // Read GPA

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (IOException e) {
            System.err.println("Error during reading student data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filename = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\datastreams\\studentData.txt"; // File to store student data

        // Store student data in the file
        storeStudentData(filename);

        // Retrieve and display the student data from the file
        retrieveStudentData(filename);
    }
}

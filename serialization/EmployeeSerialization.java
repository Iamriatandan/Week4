package serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeSerialization {
    // Method to serialize the list of employees to a file
    public static void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees); // Write the list of employees to the file
            System.out.println("Employee list serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize the list of employees from the file
    public static List<Employee> deserializeEmployees(String filename) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) ois.readObject(); // Read the list of employees from the file
            System.out.println("Employee list deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
        return employees;
    }

    public static void main(String[] args) {
        // Create some employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(761, "MeghRaj", "HR", 40000));
        employees.add(new Employee(762, "Samarth", "Engineering", 30000));
        employees.add(new Employee(763, "Sanjeev", "Marketing", 50000));

        // Serialize the employee list to a file
        String filename = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\serialization\\employees.ser";
        serializeEmployees(employees, filename);

        // Deserialize and display the employees from the file
        List<Employee> deserializedEmployees = deserializeEmployees(filename);
        if (deserializedEmployees != null) {
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        }
    }
}

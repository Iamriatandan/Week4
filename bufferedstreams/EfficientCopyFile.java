package bufferedstreams;
import java.io.*;

public class EfficientCopyFile {
    public static void main(String[] args) {
        // File paths (Modify as needed)
        String readFile = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\bufferedstreams\\readFile.txt";
        String writeBuffered = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\bufferedstreams\\writeBuffered.txt";
        String writeUnbuffered = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\bufferedstreams\\writeUnbuffered.txt";

        // Measure execution time for buffered streams
        long startTime = System.nanoTime();
        copyUsingBufferedStreams(readFile, writeBuffered);
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Measure execution time for normal file streams
        startTime = System.nanoTime();
        copyUsingFileStreams(readFile, writeUnbuffered);
        endTime = System.nanoTime();
        System.out.println("Unbuffered Streams Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    // Method 1: Copy file using Buffered Streams (Efficient)
    public static void copyUsingBufferedStreams(String read, String write) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(read));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(write))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully using Buffered Streams!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method 2: Copy file using Unbuffered Streams (Slower)
    public static void copyUsingFileStreams(String read, String write) {
        try (FileInputStream fis = new FileInputStream(read);
             FileOutputStream fos = new FileOutputStream(write)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully using Unbuffered Streams!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

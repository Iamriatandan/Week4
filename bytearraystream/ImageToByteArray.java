package bytearraystream;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class ImageToByteArray {
    // Method to convert image file to byte array
    public static byte[] imageToByteArray(String imagePath) throws IOException {
        // Reading the image file into a byte array
        File imageFile = new File(imagePath);
        byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
        return imageBytes;
    }

    // Method to write byte array to a new image file
    public static void byteArrayToImage(byte[] imageBytes, String newImagePath) throws IOException {
        // Writing the byte array to a new image file
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.write(imageBytes);
            try (FileOutputStream fileOutputStream = new FileOutputStream(newImagePath)) {
                byteArrayOutputStream.writeTo(fileOutputStream);
            }
        }
    }

    // Method to verify if two files are identical
    public static boolean verifyFiles(String originalFile, String newFile) throws IOException {
        byte[] originalBytes = Files.readAllBytes(Paths.get(originalFile));
        byte[] newBytes = Files.readAllBytes(Paths.get(newFile));
        return Arrays.equals(originalBytes, newBytes); // Comparing byte arrays
    }

    public static void main(String[] args) {
        String originalImage = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\bytearraystream\\grateful.jpg"; // Path to original image
        String newImage = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\bytearraystream\\ungrateful.jpg";           // Path to the new image

        try {
            // Convert original image to byte array
            byte[] imageBytes = imageToByteArray(originalImage);

            // Convert byte array back to a new image file
            byteArrayToImage(imageBytes, newImage);

            // Verify if the original and new image files are identical
            if (verifyFiles(originalImage, newImage)) {
                System.out.println("The new image is identical to the original.");
            } else {
                System.out.println("The new image is different from the original.");
            }
        } catch (IOException e) {
            System.err.println("Error during file operations: " + e.getMessage());
        }
    }
}

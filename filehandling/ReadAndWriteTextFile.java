package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteTextFile {

    public static void main(String[] args) {

        //String files for read and write
        String readFile = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\filehandling\\readFile.txt";
        String writeFile = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day3\\src\\filehandling\\writeFile.txt";

        readAndWrite(readFile,writeFile);
    }

    // method to read data from file and write to another file
    public static void readAndWrite(String readPath , String writePath){

        File readFile = new File(readPath);
        //condition to check if file exits
        if(!readFile.exists() || !readFile.isFile()){
            System.out.println("Error : Read File does not exist or it is not valid");
        }

        try(            FileInputStream fis = new FileInputStream(readFile);
                        FileOutputStream fos = new FileOutputStream(writePath)){

            //declaring data one byte at a time
            int data;
            while((data = fis.read())!= -1){
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("File copied Successfully to " + writePath);
        }

        catch (IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}

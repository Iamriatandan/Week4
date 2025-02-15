package trywithresorces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String file = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day4\\src\\trywithresorces\\file.txt";

        firstLine(file);
    }

    //Method to read file and only print first line
    public static void firstLine(String file){
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            line = br.readLine();
            System.out.println(line);
        }
        catch (IOException e){
            System.out.println("File not found!" + e.getMessage());
        }
    }
}

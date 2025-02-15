package checkedexception;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class CompileTimeException {
    public static void main(String[] args) {
        String file = "C:\\Users\\tanda\\OneDrive\\Documents\\Desktop\\Training\\Week4\\Day4\\src\\checkedexception\\data.txt";

        readFile(file);
    }

    //Method to read file
    public static void readFile(String file){
        try{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line ;
            System.out.println("File Contents : ");

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}


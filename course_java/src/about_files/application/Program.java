package about_files.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String path = "/home/matheus/Documents/Files-course-java-udemy/file.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
           fr = new FileReader(path);
           br = new BufferedReader(fr);

           String line = br.readLine();

           while (line != null) {
               System.out.println(line);
               line = br.readLine();
           }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

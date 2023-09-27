package lab1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/*
Name : Samuel Williams
StudentId : 21001277
Computer Science and Software Engineering.
 */

public class FileReaderTask {
    public static void main(String[] args) {
        // Getting input from user
        System.out.print("Enter the File Name :");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        // Using File Object to check if file exists
        File file = new File(fileName);
        boolean exists = file.exists();

        int numOfLines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String str;

            if (exists) {
                // br is using the readLine method to read each line and when there is nothing left to read the while loop stops.
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                    numOfLines++;
                }
            } else {
                throw new IOException();
            }
            br.close();
            System.out.println("Number of lines: " + numOfLines);
        } catch (IOException e) {

            System.out.println("File Not Found");
        }

    }
}
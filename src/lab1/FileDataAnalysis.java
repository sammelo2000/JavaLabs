package lab1;

import java.util.*;
import java.io.*;
import java.io.IOException;
/*
Name : Samuel Williams
StudentId : 21001277
Computer Science and Software Engineering.
 */
public class FileDataAnalysis {
    public static void main(String[] arg) {
        System.out.print("Enter the File Name :");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        System.out.println("Enter your FullName:");
        String fullName = scan.nextLine();
        System.out.println("Enter Student ID");
        String studentId = scan.nextLine();
        File file = new File(fileName);
        boolean exists = file.exists();
        ArrayList < Integer > arr = new ArrayList < > ();
        int sum = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String str;

            if (exists) {
                while ((str = br.readLine()) != null) {
                    arr.add(Integer.parseInt(str));

                }
            } else {
                throw new IOException();
            }
            br.close();

        } catch (IOException e) {

            System.out.println("File Not Found");
        }
        for (int x: arr) {
            sum += x;
        }
        double avg = (double) sum / arr.size();
        String strAvg = "The average is : " + avg;
        int min = arr.get(0);
        for (int x: arr) {
            if (min <= x) {} else {
                min = x;
            }
        }
        String strMin = "The minimum number is : " + min;
        int max = arr.get(0);
        for (int x: arr) {
            if (max >= x) {} else {
                max = x;
            }
        }

        String strMax = "The maximum number is : " + max;

        File file1 = new File("solution.txt");

        try {
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write(fullName + "\n");
            fileWriter.write(studentId + "\n");
            fileWriter.write(strMin + "\n");
            fileWriter.write(strMax + "\n");
            fileWriter.write(strAvg + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("IO Exception caught.");
        }

    }
}
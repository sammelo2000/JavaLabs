package lab1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.PrintWriter;

/*
Name : Samuel Williams
StudentId : 21001277
Computer Science and Software Engineering.
 */

public class FileWriterTask {
    public static void main(String[] arg) {
        System.out.println("Enter File Name:");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        File file = new File(fileName);

        try {
            if (file.exists()) {
                System.out.println("File exist,Appending to File....");
                FileWriter fW = new FileWriter(file, true);
                BufferedWriter bW = new BufferedWriter(fW);
                PrintWriter pW = new PrintWriter(bW);
                System.out.println("Add Input");
                String inPt = scan.nextLine();
                pW.println(inPt);
                pW.flush();

                System.out.println("Input Data as been Append to the file.");
                pW.close();
                bW.close();
                fW.close();

            } else if (file.createNewFile()) {
                FileWriter fWriter = new FileWriter(file);
                System.out.println("Input text");
                String inputText = scan.nextLine();
                fWriter.write(inputText);
                System.out.println("File Creation was a Success and your input has been written to it. ");
                fWriter.close();
            }
        } catch (IOException e) {
            System.out.println("IO Exception caught");
        }

    }
}
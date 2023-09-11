package lab1;
import  java.io.*;

import java.util.Scanner;

public class FileWriterTask {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String fileName = scan.nextLine();
        try {
            File fileObj = new File(fileName);
            if(fileObj.createNewFile()) {
                System.out.println(fileObj.getName() + " has been created.");
            }else {
                System.out.println("The File already exists");
            }
            FileWriter writeToFile = new FileWriter(fileName,true);
            System.out.println("Type Text");
            String strText = scan.nextLine();
            writeToFile.append("\n").append(strText);
            writeToFile.close();
            System.out.println("File written to successfully ");

//            while (true){
//                System.out.println("To append to existing file, press 1 and to exit program press 2");
//                int input = scan.nextInt();
//                if (input == 1) {
//                    System.out.println("Enter new Text:");
//                    String strInput = scan.nextLine();
//                    writeToFile.append(strInput);
//                }else {
//                    break;
//                }
//            }

        }
        catch (IOException e) {
            System.out.println("IOException occurred");
        }

    }
}

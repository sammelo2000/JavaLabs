package lab1;
import java.util.Scanner;
import java.io.*;

public class FileReaderTask {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File Name");
        String str = scan.nextLine();

        File file = new File (str);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }



    }
}

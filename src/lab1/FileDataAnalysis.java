package lab1;

import java.util.*;
import java.io.*;

public class FileDataAnalysis {
    public static void main(String[] arg) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter File Name");
//        String str = scan.nextLine();

        File file = new File ("value.txt");
        try {
            Scanner sc = new Scanner(file);
            ArrayList<Integer> arr = new ArrayList<>();
            while (sc.hasNextLine()) {
                arr.add(Integer.parseInt(sc.nextLine()));
            }




            int min = Collections.min(arr);
            int max = Collections.max(arr);
            System.out.println(min);
            System.out.println(max);
            int sum=0;
            for (Integer integer : arr) {
                sum += integer;
            }
            double avg = sum / arr.size();
            System.out.println(avg);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }





    }
}

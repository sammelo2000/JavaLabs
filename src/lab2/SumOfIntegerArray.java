package lab2;
import java.util.Scanner;
import java.util.ArrayList;
//SAMUEL WILLIAMS
//21001277
//COMPUTER SCIENCE AND SOFTWARE ENGINEERING

public class SumOfIntegerArray {
    //Displays Options to the user
    public static void main(String[] args) {
        System.out.println("Select Operation");
        System.out.println("To calculate using array size, Press 1.");
        System.out.println("To calculate array sum dynamically, Press 2.");
        Scanner scan = new Scanner(System.in);
        char opt = scan.nextLine().charAt(0);

        //switch case to run operation that was selected
        switch (opt) {
            case '1' :
                System.out.println("Enter Size of array");
                int arrSize = scan.nextInt();
                int[] arr = new int[arrSize];
                int arrSum = 0;
                // for loop to get input from user
                for(int i = 0; i  < arr.length;i++) {
                    System.out.printf("Enter integer for index [%s]" ,i);
                    arr[i] = scan.nextInt();
                }
                // for each loop to add each element in the array together
                for(int x :arr) {
                    arrSum +=  x;
                }
                System.out.println("Sum of all integers in the array is : " + arrSum );
                break;
            case '2' :
                System.out.println("Enter integers for dynamic array sum :");
                ArrayList<Integer> arrList = new ArrayList<>();
                System.out.println("To Stop adding integers to array press #");
                String strInput;
                int arrListSum = 0;


                while(true) {
                    System.out.println("Enter integer");
                    strInput = scan.nextLine();
                    //user can keep inputting till, # is inputted
                    if(!(strInput.equals("#"))) {
                        arrList.add(Integer.parseInt(strInput));
                    } else  {
                        break;
                    }

                }

                for(int x : arrList) {
                    arrListSum += x;
                }

                System.out.println("Dynamic Array Sum is : " + arrListSum);
                break;


        }
    }
}

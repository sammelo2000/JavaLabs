package lab2;
import java.util.Arrays;
import java.util.Scanner;
import  java.util.StringTokenizer;
//SAMUEL WILLIAMS
//21001277
//COMPUTER SCIENCE AND SOFTWARE ENGINEERING
public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Select Palindrome Operation");
        System.out.println("Press 1 for Palindrome Word Checker");
        System.out.println("Press 2 for Palindrome Phrase Checker");
        Scanner scan = new Scanner(System.in);
        char opt = scan.nextLine().charAt(0);

        switch (opt) {
            case '1' :
                System.out.println("Enter Word");

                String input = scan.nextLine();
                char[] arrFront = new char[input.length()];
                //characters of the string where moved into arrFront array
                for(int i = 0; i < arrFront.length;i++) {
                    arrFront[i] = input.charAt(i);
                }
                char[] arrBack = new char[arrFront.length];
                int index = 0;
                // characters were added in backwards from arrFront to arrBack
                for(int i = arrBack.length -1 ; i >= 0; i--) {
                    arrBack[index] = arrFront[i];
                    index++;
                }
                //converted each arrays to string variable
                String frontString = Arrays.toString(arrFront);
                String  backString = Arrays.toString(arrBack);
                // String variables were compared
                if(frontString.equals(backString)) {
                    System.out.println( input + " is a Palindrome");
                }else {
                    System.out.println(input + " is not a Palindrome");
                }
                break;

            case '2' :
                System.out.println(" Palindrome Phrase checker, Enter Phrase");
                String frontPhraseInput = scan.nextLine();
                // //s+ expression was removed, white space was removed
                StringTokenizer frontPhrase = new StringTokenizer(frontPhraseInput.replaceAll("\\s+" , "").toLowerCase());
                String[] frontTokenArr = new String[frontPhrase.countTokens()];

                for(int i = 0 ; frontPhrase.hasMoreTokens();i++) {
                    frontTokenArr[i] = frontPhrase.nextToken();
                }

                String[] backTokenArr = new String[frontTokenArr.length];
                int index1 = 0;
                for(int i = backTokenArr.length -1 ; i >= 0; i--) {
                    backTokenArr[index1] = frontTokenArr[i];
                    index1++;
                }

                String frontTokenPhrase = Arrays.toString(frontTokenArr);
                String backTokenPhrase = Arrays.toString(backTokenArr);
                System.out.println(frontTokenPhrase);
                System.out.println(backTokenPhrase);

                if(frontTokenPhrase.equals(backTokenPhrase)) {
                    System.out.println(frontPhraseInput + " is a Palindrome Phrase");
                }else {
                    System.out.println(frontPhraseInput + " is not a Palindrome Phrase");
                }
                break;


        }








    }
}

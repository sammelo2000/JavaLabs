package lab2;
import java.util.Scanner;
//SAMUEL WILLIAMS
//21001277
//COMPUTER SCIENCE AND SOFTWARE ENGINEERING
public class AddCharactersToStrings {
    public static void main(String[] args) {
        String initialString = "Mortal";
        String charString = "!,@,%";
        System.out.println("Initial String : " + initialString);
        System.out.println("String of characters to be added: " + charString);
        String str = initialString.concat(charString);
        System.out.println(str);
        // Display Options
        System.out.println("Select String Operation");
        System.out.println("For Concatenation, Press 1");
        System.out.println("For Substring insertion,Press 2");
        System.out.println("For Character Replacement, Press 3");
        Scanner scan = new Scanner(System.in);

        char opInput = scan.nextLine().charAt(0);
        switch (opInput) {
            case '1' :
                System.out.println("Enter first string");
                String string1st = scan.nextLine();
                System.out.println("Enter Second String");
                String string2nd = scan.nextLine();
                //using concatenation method to add string together
                System.out.println("Concatenated String : " + string1st.concat(string2nd));
                break;
            case '2' :
                System.out.println("Enter String");
              String  string11st = scan.nextLine();
                System.out.println("Enter String to insert");
             String   string22nd = scan.nextLine();
                System.out.println("Enter index to insert at ");
                int index = scan.nextInt();

                String newString;
                //try block used in case of index out of bound exception for the array
                try {
                    newString = string11st.substring(0, index + 1) + string22nd + string11st.substring(index + 1);

                    System.out.println("New String is : " + newString);
                }catch (Exception e) {
                    //exception caught and handled
                    System.out.println("Index is out of bounds");

                }
                break;
            case '3' :
                System.out.println("Enter String");
                String stringOne = scan.nextLine();
                System.out.println("Enter old character  to be replaced");
                char oldRep = scan.nextLine().charAt(0);
                System.out.println("Enter new Character ");
                char newRep = scan.nextLine().charAt(0);
                // String replace method used to switch old character with new character
                String strRep = stringOne.replace(oldRep,newRep);
                System.out.println("New String with replaced character : " + strRep);
        }

    }
}

/*Accept a string input from the user and check if it’s a palindrome (a word
 that reads the same forwards and backwards). Create a method to
 reverse the string and compare it to the original to determine if it’s a
 palindrome */


 import java.util.Scanner;
public class Prg4_reverse {

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a string: ");
        String originalString = sc.nextLine();
        String cleanedString = originalString.toLowerCase();
        String reversedString = reverseString(cleanedString);

        if (cleanedString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

    }
}

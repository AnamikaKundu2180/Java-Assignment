/* Take a string input from the user and a character to search for. Write a
 method to count the occurrences of the character in the string and return
 the count. Then display the count to the user. */

 import java.util.Scanner;

 public class Prg10_characterCounter {
 
     public static int countOccurrences(String str, char ch) {
         int count = 0;  
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == ch) {
                 count++;  
             }
         }
         return count;  
        }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String inputString = sc.nextLine();
 
         System.out.print("Enter a character to search for: ");
         char searchChar = sc.next().charAt(0);  
         int result = countOccurrences(inputString, searchChar);

         System.out.println("The character '" + searchChar + "' appears " + result + " times in the string.");

     }
 }
 
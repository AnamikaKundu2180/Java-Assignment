/* Create a program that accepts 10 integers from the user, stores them in
 an array, and then prints only the prime numbers in that array.
 Implement a separate method to check if a number is prime */


 
import java.util.Scanner;

public class Prg2_array {

    static boolean isPrime(int a){
        if (a>0){
            for(int i=2; i<a/2; i++){
                if(a %i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr= new int[10];
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter 10 integer:");
        
        
        for(int i=0; i<10; i++){
            System.out.println("Enter integer " + (i+1) + ":");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<10; i++){
            if(isPrime(arr[i])==true){
                System.out.println("\n The number "+arr[i] +" is a prime number" );
            }
        }
    }
}

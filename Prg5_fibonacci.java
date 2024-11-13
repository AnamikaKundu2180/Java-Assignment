/*Write a program that takes an integer input n and stores the first n terms
 of the Fibonacci sequence in an array. Then, print the array. For example,
 if the user enters 7, store and display the first 7 terms of the Fibonacci
 sequence: 0, 1, 1, 2, 3, 5, 8 */


import java.util.Scanner ;
public class Prg5_fibonacci {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of n till which u want the fibonacci sequence:");
        int n= sc.nextInt();

        int [] fibo;
        fibo = new int [n];
        
        fibo[0]=0;
        fibo[1]=1;
        System.out.print(fibo[0] + " " + fibo[1] +" ");

        for(int i=2; i<n; i++){
            fibo[i]=fibo[i-1] + fibo[i-2];
            System.out.print(fibo[i] +" ");
        }
        
    }
}
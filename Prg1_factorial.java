/* Write a java program that takes an integer input from user and calculates the fatorial of the number. then write a method to
 calculate the sum of the digits of the factorial. for example, if the user enters 5, calculate 5!(120) and then find the sum
 of its digits (1+2+0=3). */

 import java.util.Scanner ;
 public class Prg1_factorial {

    static int sum(int a) {
        int sum=0;
        while (a !=0) {
            sum= sum + a % 10;
            a= a/10;
        }
        return sum;
    }


    public static void main(String []args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int fact=1;
        for (int i=1; i<=num; i++) {
            fact = fact*i ;
        } 
        System.out.println("Factorial="+ fact);
        System.out.println("The sum of digits= " + sum(fact));
    }
 }

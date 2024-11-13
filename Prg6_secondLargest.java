/* Write a program that accepts n integers from the user (where n is also
 provided by the user). Store the numbers in an array and write a method
 to find and display the second largest number in the array */


 import java.util.Scanner;

 public class Prg6_secondLargest {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of integer:");
        int n= sc.nextInt();
        int [] a= new int [n];
        int temp;

        for(int i=0; i<n; i++ ){
            System.out.println("Enter the integer " + (i+1) +":");
            a[i]= sc.nextInt();
        }
        System.out.println("The entered array is:");
        for(int i=0; i<n; i++ ){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int i=0; i<n; i++ ){
            for(int j=i+1;j<n; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("The second largest number is : " + a[1]);
        
    }
 }
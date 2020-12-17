//Q10 Array
import java.util.*;
class arraypalindrome{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      String a[]=new String[n];
      System.out.println("Enter the string elements of array");
      for (int i=0; i<n;i++){
         System.out.print("Enter "+(i+1)+" element:  ");
         a[i]= sc.next();
      }
      int ctr = 0;
      for (int i=0; i<n/2;i++){
         if(a[i].equals(a[n-1-i])) ctr++;
         else continue;
      }
      if(ctr==n/2) System.out.println("Entered array is palindrome.");
      else System.out.println("Entered array is not palindrome.");
   }
}
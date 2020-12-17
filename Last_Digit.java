import java.util.*;
public class Last_Digit{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter 1 st number : ");
     int a = sc.nextInt();
     System.out.print("\nEnter 2 nd number : ");
     int b = sc.nextInt();
     if(a%10 == b%10){
       System.out.print("The last digit is the same ");
     }
     else
      System.out.print("The last digit isnt the same ");

   }
   
}
import java.util.*;
public class prime_numbers{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number upto which Prime numbers are to be printed :");
      int n = sc.nextInt();
      if(n>=2){
       System.out.print("\nThe Prime Numbers are : ");
       int x = 0;
       for(int i = 1; i<=n ; i++){
          int ctr = 0;
          for(x=i; x>=1; x--){
             if(i%x == 0){
                ctr= ctr+1;
             }
          }
          if(ctr == 2){
             System.out.print(" "+i);
          }
       }
      }
      else
         System.out.print("\nInvalid input");
   }
}
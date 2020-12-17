//Q4 Array
import java.util.*;
public class freq_array{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array :");
      int s = sc.nextInt();
      int a[] = new int[s];
      System.out.print("\nEnter the elements :");
      for(int i = 0 ; i<s ; i++){
         System.out.print("\nEnter element "+ (i+1)+ " ");
         a[i] = sc.nextInt();
      }
      
      System.out.print("\nEnter the number to be searched ");
      int n = sc.nextInt();
      int ctr = 0;
      
      for(int i =0 ; i<s ; i++){
         if(a[i] == n ){
            ctr = ctr+1;
         }
      }
      System.out.print("\nThe frequency of "+n+" is :"+ctr);
   }
}
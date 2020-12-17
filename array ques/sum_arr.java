//Q3 Array
import java.util.*;
public class sum_arr{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the 5 elemts of array :");
      int a[] = new int[5];
      int sum = 0;
      for(int i = 0 ; i<5 ; i++){
         System.out.print("\nEnter element "+(i+1)+" :");
         a[i] = sc.nextInt();
      }
      System.out.print("\nPress 1 for Sum of all elements \nPress 2 for alternate number sum \nPress 3 for highest element in array \n");
      int choice = sc.nextInt();
      if(choice == 1 ){
         System.out.print("\nThe sum of all the elements is :");
         for(int i = 0 ; i<5 ; i++){
            sum = sum +a[i];
         }
         System.out.print(" "+sum);
      }
      else if(choice == 2){
         System.out.print("\nThe sum of all alternate elements is :"+(a[0]+a[2]+a[4]));
         for(int i = 0 ; i<5 ; i++){
            
         }
         
      }
      else if(choice == 3){
         int highest = a[0];
         for(int i = 0; i<5 ; i++){
            if(a[i]>highest){
               highest = a[i];
            }
         }
         System.out.print("\nThe highest element is :"+highest);
      }
      else{
         System.out.print("\nInvalid input");
      }
   }
}
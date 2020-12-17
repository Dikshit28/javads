//Q7 Array
import java.util.*;
public class swap{
   public static void main(String args[]){
      swap s = new swap();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      int size = sc.nextInt();
      int a[] = new int[size];
      System.out.print("\nEnter the elements of array :");
      for(int i = 0 ; i<size ; i++){
         System.out.print("\nEnter element "+(i+1)+" ");
         a[i] = sc.nextInt();
      }
      s.swap_pairs(a);
      
   }
   
   public static void swap_pairs(int [] a){
      int x = a.length;
      int y =0;
      String st = "";
      if(a.length%2!=0){
         for(int i = 0 ; i<a.length-1 ; i=i+2){
            y= a[i];
            a[i] = a[i+1];
            a[i+1] = y;
            System.out.print(""+a[i]+","+a[i+1]+",");
         }
         System.out.print(a[a.length-1]);
      }
      if(a.length%2==0){
         for(int i = 0 ; i<a.length-1 ; i=i+2){
            y= a[i];
            a[i] = a[i+1];
            a[i+1] = y;
            System.out.print(""+a[i]+","+a[i+1]);
            if(i+2<a.length){
               System.out.print(",");
            }
         }
      }
   }
}
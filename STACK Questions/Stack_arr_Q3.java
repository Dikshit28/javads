import java.util.*;
public class Stack_arr_Q3{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the String : ");
      String word = sc.next();
      String[] a = word.split("\\s+");
      int x = a.length;
      System.out.print(a[0]+a[1]+a[2]+a[3]);
      for(int i = 0; i <x; i++){
         push(a[i],x,a);
      }
      reverse(x,a);
      
      
   }
   
   public static void push(String word,int size,String[] array){
      top=top+1;
      if(top<=size-1){ 
         array[top] = word ;
      }
      else
         System.out.print("STACK OVERFLOW");

   }
   
   
   public static void reverse(int x, String[] words){
      for(int i = x-1; i>=0; i--){
         System.out.print("\n"+words[i]);
      }
   }
}
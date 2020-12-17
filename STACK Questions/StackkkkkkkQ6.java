import java.util.*;
class StackkkkkkkQ6{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int[] array;
      int size = 0;
      System.out.print("Enter no.of elements:  ");
      size = sc.nextInt();
      array = new int[size];
      System.out.println("Push elements in stack");
      for(int i =0; i<size ;  i++){
         System.out.print("Enter "+(i+1)+" element:  ");
         int a = sc.nextInt();
         push(a,array);
      }
      RemoveOdd(array);
      System.out.println("Stack after removing odd elements.");
      print(array);
   }
   public static void push(int a,int array[]){
      if(top==array.length-1){
         System.out.println("Stack overflow!!!");
      }
      else{
         top++;
         array[top] = a;
      }
   }
   public static void pop(int array[]){
      if(top==-1){
         System.out.println("Stack underflow!!!");
      }
      else{
         top--;
      }
   }
   public static void print(int array[]){
      if(top==-1) System.out.println("Empty Stack.");
      else{
         for(int i = top; i>=0; i--){
            System.out.print(array[i]+" ");
         }
         System.out.println();
      }
   }
   public static void RemoveOdd(int array[]){
      if(top==-1) System.out.println("Empty Stack.");
      else{
         int top1 = -1;
         int temp[] = new int[array.length];
         while(top>=0){
            if(array[top]%2 == 0){
               top1++;
               temp[top1] = array[top];
               pop(array);
            }
            else pop(array);
         }
         while(top1>=0){
            push(temp[top1],array);
            top1--;
         }
      }
   }  
}
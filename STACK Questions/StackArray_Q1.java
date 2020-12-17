import java.util.*;
class StackArray_Q1{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int[] array = new int[10];
      int choice = 0;
      do{
         System.out.println(" Enter 1  to add element in stack.\n Enter 2 to pop elements.\n Enter 3 to print top element.\n Enter 4 to print stack.\n Enter 5 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Push element in stack:  ");
            int a = sc.nextInt();
            push(a,10,array);
         }
         else if(choice==5){ 
            System.out.println("Program terminated.");
         }
         else if(choice==4){
            print(array);
         }
         else if(choice==2){
            pop(array);
         }
         else if(choice==3){
            peep(array);
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=5);
   }
   public static void push(int a, int size,int array[]){
      if(top==size-1){
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
         System.out.println(array[top]);
         top--;
      }
   }
   public static void peep(int array[]){
      if(top==-1){
         System.out.println("Stack underflow!!!");
      }
      else{
         System.out.println(array[top]);
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
}
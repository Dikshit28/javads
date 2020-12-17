import java.util.*;
public class Stack_Impl{
   static int top=-1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of stack: ");
      int size= sc.nextInt();
      int[] a = new int[size];
      while(true){
         System.out.println("\nPress 1 to Push a stack element ");
         System.out.println("Press 2 to Pop a stack element ");
         System.out.println("Press 3 to topmost element ");
         System.out.println("Press 4 to Print all the stack elements ");
         System.out.println("Press 5 to quit");
         int choice = sc.nextInt();
         if(choice == 1){
            System.out.print("\nEnter the element to be pushed : ");
            int element = sc.nextInt();
            push(element,size,a);
         }
         else if(choice == 2){
            System.out.print("\nPopping the last entered digit ");
            pop(a);
         }
         else if(choice == 3){
            System.out.print("\nPeeking the topmost element :");
            peek(a);
         }
         else if(choice == 4){
            System.out.print("\nPrinting the stack");
            print(a);

         }
         else if( choice == 5){
            break;
         }
         else
            System.out.print("Invalid Input");
      } 
   }
   
   public static void push(int e,int size,int[] array){
      top=top+1;
      if(top<=size-1){ 
         array[top] = e;
      }
      else
         System.out.print("STACK OVERFLOW");
   }
   
   public static void pop(int[] array){
      if(top>0){
        array[top]=0;
        top=top-1; 
      }
      else if(top==0){
         array[top]=0;
         top=-1;
      }
      else
         System.out.print("STACK UNDERFLOW");
   }
   
   public static void peek(int[] array){
      System.out.print("\n"+array[top]);
   }
   
   public static void print(int[] array){
      System.out.println("\n");
      if(top!=-1){
         for(int i =0; i<=top; i++){
            System.out.println(array[i]);
         }
      } 
      if(top==-1){
         System.out.print("\nStack is Empty");
      }  
   }
}
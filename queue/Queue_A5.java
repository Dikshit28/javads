import java.util.*;
class Queue_A5{
   static int top1 = -1;
   static int top2 = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int[] array = new int[100];
      int choice = 0;
      do{
         System.out.println(" Enter 1 to enqueue element in queue.\n Enter 2 to print queue.\n Enter 3 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Enter an element:  ");
            int a = sc.nextInt();
            enqueue(1,a,array);
         }
         else if(choice==3) System.out.println("Program terminated.");
         else if(choice==2){
            print(array);
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=3);
   }
   public static void enqueue(int b,int a,int array[]){
      if(b ==1){
         top1++;
         array[top1] = a;
      }
      if(b ==2){
         top2++;
         array[top2] = a;
      }
   }
   public static void print(int array[]){
      if(top1==-1) System.out.println("Empty Queue.");
      else{
         int[] array2 = new int[array.length];
         for(int i = top1; i>=0; i--){
            enqueue(2,array[i],array2);
         }
         while(top2>-1){
            System.out.print(array2[top2]+" ");
            top2--;
         }
         System.out.println();
      }
   } 
}
   
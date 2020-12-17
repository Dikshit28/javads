import java.util.*;
public class Queue_Arr{
   static int front = -1;
   static int rear = -1;
   public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the size of queue : ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      while(true){
         System.out.print("\nPress 1 to Enter element into QUEUE");
         System.out.print("\nPress 2 to Delete element from QUEUE");
         System.out.print("\nPress 3 to Display elements of QUEUE");
         System.out.print("\nPress 4 to Exit\n");
         int choice = sc.nextInt();
         if(choice==1){
            System.out.print("\nEnqueue element, Please enter the element : ");
            int element = sc.nextInt();
            enqueue(arr,element,size);
         }
         else if(choice == 2){
            System.out.print("\nDequeue element");
            dequeue(arr,size);
         }
         else if (choice == 3){
            System.out.print("\nDisplaying elements");
            display(arr);
         }
         else if (choice == 4){
            System.out.print("\nExitting program");
            System.exit(0);
         }
         else{
            System.out.print("\nInvalid Input! Enter again.");
         }
      }
   }
   
   public static void enqueue(int[] arr, int element, int size){
      if(rear+1<size){
         arr[rear+1]=element;
         rear=rear+1;
      }
      else if(rear+1==size){
         System.out.print("\nQueue is FULL");
      }
   }
   
   public static void dequeue(int [] arr, int size){
      if(rear==-1){
         System.out.print("\nQueue is EMPTY");
      }
      else{
         for(int i = 0; i<size-1; i++){
            arr[i] = arr[i+1];
         }
         rear = rear-1;
      }
   }
   
   public static void display(int [] arr){
      if(rear==-1){
         System.out.print("\nQueue is EMPTY");
      }
      
      System.out.print("\n");
      for (int i = 0; i<=rear ; i++){
         System.out.print(arr[i]+" ");
      }
   }
}
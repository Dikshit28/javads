import java.util.*;
class Node{
   int data;
   Node next;
   Node(){
      this.data = 0;
      this.next = null;
   }
}
public class Queue_Node{
   static Node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.print("\nPress 1 to Enter element into QUEUE");
         System.out.print("\nPress 2 to Delete element from QUEUE");
         System.out.print("\nPress 3 to Display elements of QUEUE");
         System.out.print("\nPress 4 to Display even elements of QUEUE");
         System.out.print("\nPress 5 to Exit\n");
         int choice = sc.nextInt();
         if(choice==1){
            System.out.print("\nEnqueue element, Please enter the element : ");
            int element = sc.nextInt();
            enqueue(element);
         }
         else if(choice == 2){
            System.out.print("\nDequeue element");
             dequeue();
         }
         else if (choice == 3){
            System.out.print("\nDisplaying elements :");
            print_queue();
         }
         else if(choice==4){
            System.out.print("\nDisplaying even elements :");
            even_queue();
         }
         else if (choice == 5){
            System.out.print("\nExitting program");
            System.exit(0);
         }
         else{
            System.out.print("\nInvalid Input! Enter again.");
         }
      }

   }
   
    public static void enqueue(int data_){
      Node new_node = new Node();
      new_node.data = data_;
      Node temp = new Node();
      temp = head;
      if(head==null){
         head = new_node;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = new_node; 
      }    
   }
   
   public static void dequeue(){
      Node temp = new Node();
      temp = head;
      if(head!= null){
         head = temp.next;
         temp.next = null;
      }
      else
         System.out.print("\nQueue in empty");   
   }
   
   public static void even_queue(){
      Node temp = new Node();
      temp = head;
      int count =0;
      while(temp!=null){
         if(temp.data%2!=0){
            count=count+1;
         }
         temp = temp.next;
         
      }
      System.out.print("\nThe count of even numbers is :"+count);
   }
   
   public static void print_queue(){
      Node temp = new Node();
      temp = head;
      if(temp == null){
         System.out.print("\nNo Elements found!\n");
      }
      else{
         while(temp.next!=null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
         }
         System.out.print(temp.data+"\n");
      }
   }


   
}

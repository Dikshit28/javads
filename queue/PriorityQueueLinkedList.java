import java.util.*;
class Last{
   int data;
   Last next ;
   int prio ;
   Last(){
      data = 0;
      next = null;
      prio = 0;
   }
}
public class PriorityQueueLinkedList{
   static Last last;
   static Last first;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      do{
         System.out.println(" Enter 1 to enqueue element in queue.\n Enter 2 to dequeue element.\n Enter 3 to print first element.\n Enter 4 to print queue.\n Enter 5 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Enter an element:  ");
            int a = sc.nextInt();
            System.out.print("Enter priority number:  ");
            int b = sc.nextInt();
            enqueue(a,b);
         }
         else if(choice==5) System.out.println("Program terminated.");
         else if(choice==4){
            print();
         }
         else if(choice==2){
            dequeue();
         }
         else if(choice==3){
            top();
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=5);
   }
   public static void enqueue(int a, int b){
      Last n = new Last();
      n.data = a;
      n.prio = b;
      n.next = null;
      if(first == null){
         first = n;
         last = n;
      }
      else if(first != null && b <first.prio){
         if(first.next==null){
            n.next = last;
            first = n;
         }
         else{
            n.next = first;
            first = n;
         }
      }
      else if(first.next == null && b>=first.prio){
         last = n;
         first.next = last;
      }
      else{
         Last temp = first;
         while(b>=temp.next.prio && temp.next!= null){
            temp = temp.next;
            if(temp.next == null) break;
         }
         if(temp.next == null){
            last.next = n;
            last = n;
         }
         else{
            n.next = temp.next;
            temp.next = n;
         }
      }
   }
   public static void print(){
      Last temp = new Last();
      temp = first;
      if(first == null) System.out.println("Queue empty");
      else{
         while(temp!=last){
            System.out.print(temp.data+"  ");
            temp = temp.next;
         }
         System.out.print(temp.data);
         System.out.println();
      }
   }
   public static void dequeue(){
      Last temp = new Last();
      if(first==null) System.out.println("Queue Empty");
      else if(first == last){
         System.out.println("Dequeued element :  "+first.data);
         first = null;
         last = null;
      }
      else{
         System.out.println("Dequeued element :  "+first.data);
         first = first.next;
      }
   }
   public static void top(){
      if(first==null) System.out.println("Queue Empty");
      else System.out.println("first element : "+first.data);
   }
}
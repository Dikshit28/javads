import java.util.*;
public class Linked_SetC_Q12{
   static Node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of students:  ");
      int size = sc.nextInt();
      for(int i =0; i<size; i++){
         Node_end(i+1);
      }
      System.out.print("Enter the value at which the student should get eliminated :  ");
      int value = sc.nextInt();
      eliminate(value);
   }
   public static void Node_end(int a){
      Node n = new Node();
      n.data = a;
      Node temp = new Node();
      temp = head;
      if(head == null){
         head = n;
         head.next = head;
      }
      else{
         while(temp.next!=head){
            temp = temp.next;
         }
         n.next = head;
         temp.next = n;
      }
   }
   public static void eliminate(int value){
      int i = 0;
      while(i<1){
         if(head.next == head){
            System.out.println(head.data+" is the winner.");
            i = 2;
         }
         else{
            del_position(value);
         }
      }
   }
   public static void del_position(int j){
      Node temp = new Node();
      temp = head;
      if(j>0){
         int r = 0;
         for(int i =0; i<j-2;i++){
            temp=temp.next;
         }
         if (r==0){
            temp.next= (temp.next).next;
            head = temp.next;
         }
      }
   }
}
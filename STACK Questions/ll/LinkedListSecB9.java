import java.util.*;
import java.util.*;
class node{
   char data;
   node next ;
   node pre ;
   node(){
      data = 0;
      next = null;
      pre = null;
   }
}
public class LinkedListSecB9{
   static node head;
   static node tail;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of list :  ");
      int size = sc.nextInt();
      for(int i = 0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         char a = sc.next().charAt(0);
         back(a);
      }
      System.out.println("List before rotation.");
      printForward();
      System.out.print("Enter the number of node to rotate :  ");
      int num = sc.nextInt();
      if(num>=size) System.out.println("Invalid input, number should be less than size of list.");
      else{ 
         rotate(num);
         System.out.println("List after rotation.");
         printForward();
      }
   }
   public static void back(char a){
      node n = new node();
      n.data = a;
      if(head == null){
         head = n;
         tail = n;
      }
      else{
         tail.next = n;
         n.pre= tail;
         tail = tail.next;
      }
   }
   public static void printForward(){
      node temp = new node();
      temp = head;
      if(head == null) System.out.println("List is empty.");
      else{
         while(temp!=tail){
            System.out.print(temp.data+"  ");
            temp = temp.next;
         }
         System.out.print(tail.data);
         System.out.println();
      }
   }
   public static void rotate(int num){
      node temp = head;
      char k = 0;
      char m = 0;
      for(int i = 0; i<num ; i++){
         temp = head;
         k = temp.data;
         while(temp != tail){
            m = temp.next.data;
            temp.next.data = k;
            temp = temp.next;
            k = m;
         }
         head.data = m;
      }
   }
}
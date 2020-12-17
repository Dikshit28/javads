import java.util.*;
class node{
   int data;
   node next ;
   node(){
      data = 0;
      next = null;
   }
}
public class LinkedListSecB6{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter integer value:  ");
      int value = sc.nextInt();
      while(value>0){
         int i = value%2;
         back(i);
         value = value/2;
      }
      print();
   }
   public static void back(int a){
      node n = new node();
      n.data = a;
      node temp = new node();
      temp = head;
      if(head == null){
         head = n;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = n;
      }
   }
   public static void print(){
      node temp = new node();
      temp = head;
      if(head == null) System.out.println("List is empty.");
      else{
         while(temp.next!=null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
         }
         System.out.print(temp.data);
         System.out.println();
      }
   }
}
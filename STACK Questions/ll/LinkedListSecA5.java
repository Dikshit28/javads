import java.util.*;
class node{
   int data;
   node next ;
   node(){
      data = 0;
      next = null;
   }
}
public class LinkedListSecA5{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter no. of elements of list:");
      int size = sc.nextInt();
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         back(a);
      }
      System.out.print("Entered list:  ");
      print();
      System.out.print("After reversing elements in pair:  ");
      swappair();
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
   public static void swappair(){
      node temp = new node();
      temp = head;
      int m =0;
      if(head==null) System.out.println("List is empty.");
      else if (head.next==null) System.out.println("Size of list is 1 hence it can't be swap.");
      else{
         while(temp.next!=null && (temp.next).next!=null){
            m = temp.data;
            temp.data= (temp.next).data;
            (temp.next).data = m;
            temp=(temp.next).next;
         }
         if(temp.next!=null && (temp.next).next==null){
            m = temp.data;
            temp.data= (temp.next).data;
            (temp.next).data = m;
         }
      }
   }
}
import java.util.*;
class Node2{
   int data;
   Node2 next;
   Node2 prev;
   Node2(){
      this.data = 0;
      this.next = null;
      this.prev = null;
   }
}

public class doubly_linked{
   static Node2 head;
   static Node2 tail;
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   Node2 n1 = new Node2(); 
   Node2 n2 = new Node2();
   Node2 n3 = new Node2();
   n1.data = 5;
   n2.data = 6;
   n3.data = 7;
   head = n1;
   n1.prev = null;
   n1.next = n2;
   n2.prev = n1;
   n2.next = n3;
   n3.prev = n2;
   n3.next = null;
   tail = n3;
   
   
   Node2 temp = new Node2();
   temp = head;
   while(temp.next!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
   }
   System.out.print(temp.data);
   
   
   
   }
}
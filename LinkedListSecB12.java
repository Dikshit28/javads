import java.util.*;
class node{
   int data;
   node next ;
   node pre ;
   node(){
      data = 0;
      next = null;
      pre = null;
   }
}
public class Linked_SetC_Q12{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of students:  ");
      int size = sc.nextInt();
      for(int i =0; i<size; i++){
         back(i+1);
      }
      System.out.print("Enter the value at which the student should eliminated :  ");
      int value = sc.nextInt();
      eliminate(value);
   }
   public static void back(int a){
      node n = new node();
      n.data = a;
      node temp = new node();
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
            System.out.println(head.data+" is winner.");
            i = 2;
         }
         else{
            delSpecific(value);
         }
      }
   }
   public static void delSpecific(int j){
      node temp = new node();
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
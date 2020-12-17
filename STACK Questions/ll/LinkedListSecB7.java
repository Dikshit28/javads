import java.util.*;
class node{
   int data;
   node next ;
   node(){
      data = 0;
      next = null;
   }
}
public class LinkedListSecB7{
   static node head1;
   static node head2;
   static node head3;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of lists:  ");
      int size = sc.nextInt();
      System.out.println("Enter elements for list 1.");
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         back(a,1);
      }
      System.out.println("Enter elements for list 2.");
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         back(a,2);
      }
      shuffleMerge(size);
      print();
   }
   public static void back(int a,int b){
      node n = new node();
      n.data = a;
      node temp = new node();
      if(b==1){
         temp = head1;
         if(head1 == null){
            head1 = n;
         }
         else{
            while(temp.next!=null){
               temp = temp.next;
            }
            temp.next = n;
         }
      }
      else if(b==2){
         temp = head2;
         if(head2 == null){
            head2 = n;
         }
         else{
            while(temp.next!=null){
               temp = temp.next;
            }
            temp.next = n;
         }
      }
   }
   public static void back(int a){
      node n = new node();
      n.data = a;
      node temp = new node();
      temp = head3;
      if(head3 == null){
         head3 = n;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = n;
      }
   }
   public static void shuffleMerge(int size){
      node temp1 = head1;
      node temp2 = head2;
      int[] temp = new int[size*2];
      int i =0;
      while(temp1 != null && temp2 != null){
         temp[i] = temp1.data;
         temp[i+1] = temp2.data;
         i = i+2;
         temp1 = temp1.next;
         temp2 = temp2.next;
      }
      for(i = 0; i<size*2; i++){
         back(temp[i]);
      }
   }
   public static void print(){
      node temp = new node();
      temp = head3;
      if(head3 == null) System.out.println("List is empty.");
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
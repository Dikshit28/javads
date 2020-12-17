import java.util.*;
class node{
   int data;
   node next ;
   node(){
      data = 0;
      next = null;
   }
}
public class LinkedListSecA4{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of linked list:");
      int s = sc.nextInt();
      int a[] = new int[s];
      for(int i = 0; i<s ; i++){
         System.out.print("Enter element "+(i+1)+" : ");
         a[i] = sc.nextInt();
         back(a[i]);
      }
      System.out.print("The entered list :");
      print();
      
      int p = palindrome(a);
      if(p==1){
         System.out.print("\nThe list is palindrome");
      }
      else
         System.out.print("\nThe list is not palindrome");

      
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
   public static void back(int data_){
      node n = new node();
      n.data = data_;
      node temp = new node();
      temp = head;
      if(head==null){
         head = n;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = n; 
      }    
   }
   public static int palindrome(int[] b){ 
      int ctr = 0;
      int l = b.length;
      for (int j=0; j<l/2; j++) {
         if (b[j]==(b[l-j-1])){
            ctr = ctr+1;
         }
         else
            continue;   
      }
      if(ctr==l/2){
         return 1;
      } 
      else{
         return 0;
      }        
   }

}
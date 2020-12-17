import java.util.*;
public class link_compare{
   static Node head1;
   static Node head2;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int list1_size =0;
      int list2_size =0;
      System.out.print("Enter no. of elements of list1:");
      list1_size = sc.nextInt();
      for(int i =0; i<list1_size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         node_end(a,1);
      }
      System.out.print("Enter no. of elements of list2:");
      list2_size = sc.nextInt();
      for(int i =0; i<list2_size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         node_end(a,2);
      }
      findIdentical(list1_size,list2_size);
   }
   public static void node_end(int a,int b){
      Node n = new Node();
      n.data = a;
      Node temp = new Node();
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
   public static void findIdentical(int list1_size,int list2_size){
      if(list1_size != list2_size){
         System.out.println("The two lists are NON-IDENTICAL");
      }
      else{
         Node temp1 = head1;
         Node temp2 = head2;
         int ctr = 0;
         while(temp1!= null && temp2!= null){
            if(temp1.data == temp2.data) ctr++;
            temp1 = temp1.next;
            temp2 = temp2.next;
         }
         if(ctr == list1_size) System.out.println("The two lists are IDENTICAL");
         else System.out.println("The two lists are NON-IDENTICAL");
      }
   }
}
import java.util.*;
public class Linked_SetB_Q7{
   static Node head1;
   static Node head2;
   static Node head3;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of lists:  ");
      int size = sc.nextInt();
      System.out.println("Enter elements of list 1.");
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         node_end(a,1);
      }
      System.out.println("Enter elements of list 2.");
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         node_end(a,2);
      }
      shuffleMerge(size);
      print_nodes();
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
   public static void node_end(int a){
      Node n = new Node();
      n.data = a;
      Node temp = new Node();
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
      Node temp1 = head1;
      Node temp2 = head2;
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
         node_end(temp[i]);
      }
   }
   public static void print_nodes(){
      Node temp = new Node();
      temp = head3;
      if(temp == null){
         System.out.print("\nNo Elements found!\n");
      }
      else{
         while(temp.next!=null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
         }
         System.out.print(temp.data+"\n");
      }
   }
}
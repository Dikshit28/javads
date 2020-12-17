import java.util.*;
public class Swap_ListQ{
   static Node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the size of linked list ");
      int s = sc.nextInt();
      for(int i = 0; i<s ; i++){
         System.out.print("\nEnetr element "+(i+1)+" : ");
         int x = sc.nextInt();
         node_end(x);
      }
      print_nodes();
      swap_pair();
      print_nodes();
   }
   
    public static void node_end(int data_){
      Node new_node = new Node();
      new_node.data = data_;
      Node temp = new Node();
      temp = head;
      if(head==null){
         head = new_node;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = new_node; 
      }    
   }
   
   public static void print_nodes(){
      Node temp = new Node();
      temp = head;
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
   
   public static void swap_pair(){
      System.out.print("\nSwapping Pairwise \n");
      Node temp = new Node();
      temp = head;
      int y = head.data;
      if(head==null){
         System.out.print("\nList is empty");
      }
      else if(head.next==null){
         System.out.print("List contains only one element.");
      }
      else{
         temp.data = temp.next.data;
         temp.next.data = y;
         temp = temp.next.next;
         
         while(temp.next!=null){
            int x = temp.data;
            temp.data = temp.next.data;
            temp.next.data = x;
            if(temp.next.next!=null){
               temp = temp.next.next;
            }
            else if(temp.next.next==null){
               break;
            }   
             
         }
         
      }
   }

}   

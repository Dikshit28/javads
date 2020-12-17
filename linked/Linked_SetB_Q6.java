import java.util.*;
public class Linked_SetB_Q6{
   static Node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the number : ");
      String input = sc.next();
      int ctr = 0;
      for(int i = 0; i < input.length(); i++){
        if(Character.isDigit(input.charAt(i)) == true){   
            ctr = ctr+1;
        }
        else
         continue;
      }
      if(ctr==input.length()){
         int num = Integer.parseInt(input);
         convert_Binary(num);
         print_nodes();
      } 
      else{
         System.out.print("\nInput is not an Integer");
      }
   }
   
   
   //Printing the nodes
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
   
   //Adding node at the end
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
   
   //Binary Conversion
   public static void convert_Binary(int num){
      int n;
      while(num!=1){
         n=num%2;
         num = num/2;
         node_end(n);
      }
      node_end(1);
   }

}
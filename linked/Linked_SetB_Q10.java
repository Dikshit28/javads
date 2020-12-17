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
public class Linked_SetB_Q10{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of list:  ");
      int size = sc.nextInt();
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         node_end(a);
      }
      int choice = 0;
      do{
         System.out.println("\n Enter 1 to add in between by index number.\n Enter 2 to delete an element at specific location.\n Enter 3 to print list.\n Enter 4 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Enter index value:  ");
            int i = sc.nextInt();
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            add_node_index(i,a);
         }
        
         else if(choice==4){
            System.out.println("Program terminated.");
         }
         else if(choice==3){
            print_nodes();
         }
         else if(choice==2){
            System.out.print("Enter index of value you want to delete:  ");
            int a = sc.nextInt();
            del_Index(a);
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=4);
   }
   public static void node_end(int a){
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
   public static void print_nodes(){
      node temp = new node();
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
  public static void add_node_index(int index,int data_){ 
      node temp = new node();
      node new_node = new node();
      new_node.data = data_;
      int ctr = 0;
      temp = head;
      if(index == 0 ){
         new_node.next = head;
         head = new_node;
         ctr = 1;
      }
      else if(index == 1){
         new_node.next = head.next;
         head.next = new_node;
         ctr = 1;
      }
      
      else {
         for(int i = 0 ; i<index-1 ; i++){
            if(temp.next==null){
               System.out.println("Entered index is out of bound.");
               ctr = 1;
               break;
            }
            else
               temp =temp.next;
         }
         if(ctr==0){
            new_node.next = temp.next;
            temp.next=new_node;
         }
      }
        
      
   }

   public static void del_Index(int j){
      node temp = new node();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else if(j ==1){
         while(temp.next!=head){
            System.out.print(temp.data+"  ");
            temp = temp.next;
         }
         head = head.next;
         temp.next = head;
      }
      else if (j>0){
         int r = 0;
         for(int i =0; i<j-2;i++){
            if(temp.next==head){
               System.out.println("Entered index is out of bound.");
               r=1;
               break;
            }
            else{
               temp=temp.next;
            }
         }
         if (r==0) temp.next= (temp.next).next;
      }
   }
}
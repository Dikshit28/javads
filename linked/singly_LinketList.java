import java.util.*;
class Node{
   int data;
   Node next;
   Node(){
      this.data = 0;
      this.next = null;
   }
}
public class singly_LinketList{
   static Node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      Node n1 = new Node();
      Node n2 = new Node();
      Node n3 = new Node();
      n1.data = 5;
      n2.data = 6;
      n3.data = 7;
      head = n1;
      n1.next = n2; 
      n2.next = n3;
      while(true){
         System.out.println("\nEnter 1 to add a new Node at the beginning");
         System.out.println("Enter 2 to add a new Node at the end");
         System.out.println("Enter 3 to add a new Node at a specific location");
         System.out.println("Enter 4 to delete a Node at the beginning");
         System.out.println("Enter 5 to delete a Node at the end");
         System.out.println("Enter 6 to delete a Node at a specific location");
         System.out.println("Enter 7 to print all the nodes");
         System.out.println("Enter 8 to exit");
         System.out.print("Enter your choice : ");
         int input = sc.nextInt();
         if(input==1){
            System.out.print("\nEnter the data of Node to be added at the beginning : ");
            int data_ = sc.nextInt();
            node_beginning(data_);
         }
         else if(input==2){
            System.out.print("\nEnter the data of Node to be added at the end : ");
            int data_ = sc.nextInt();
            node_end(data_);
         }
         else if(input==3){
            System.out.print("\nEnter the data of Node : ");
            int data_ = sc.nextInt();
            System.out.print("\nEnter the index at which Node is to be added : ");
            int index = sc.nextInt();
            add_node_index(index,data_);
            
         }
         else if(input==4){
            System.out.print("\nDeleting the node at the beginning");
            del_first();
         }
         else if(input==5){
            del_last();
         }
         else if(input==6){
            System.out.print("\nEnter the index of node to be deleted ");
            int index = sc.nextInt();
            del_index(index);
         }
         else if(input==7){
            print_nodes();  
         }
         else if(input == 8){
            System.out.print("Exiting loop");
            break;
         }
         
         else
            System.out.print("\nWrong Input!! Enter again ");
      }
      
   }
   
   //Adding node at the beginning
   public static void node_beginning(int data_){
      Node new_node = new Node();
      new_node.data = data_;
      new_node.next = head;
      head = new_node;
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
   
   //Print all the nodes
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
   
   //Adding node at a specific index
   public static void add_node_index(int index,int data_){ 
      Node temp = new Node();
      Node new_node = new Node();
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
   
   //Deleting the node at the beginning
   public static void del_first(){
      Node temp = new Node();
      temp = head;
      if(head!= null){
         head = temp.next;
         temp.next = null;
      }
      else
         System.out.print("\nList in empty");   
   }
   
   //Deleting the last element
   public static void del_last(){
      Node temp = new Node();
      temp = head;
      if(head==null){
         System.out.print("\nNo elements in the list");
      }
      else if(head.next==null){
         head=null;
      }
      else{
       while(3>1){
          if(temp.next == null){
            temp = temp.next;
            break;
          } 
          if((temp.next).next == null){
             temp.next = null;
             break;
          }
        
          temp = temp.next; 
       }
      }
   }
   
   //Deleting alternate elements
   public static void del_alt(){
      Node temp = new Node();
      temp = head;
      int x = 0;
      if(head==null){
         System.out.print("\nThe List is empty");
      }
      else if(head.next==null){
         System.out.print("\nList contains only one node");
      }
      else{
         while(temp.next!=null){
            if(temp.next.next==null){
               temp.next=null;
            }
            else{
               temp.next=temp.next.next;
               temp = temp.next;
            }
         }
      }
   }
   
   //Deleting duplicates from unsorted list
   public static void del_duplicate(){
      Node temp = new Node();
      temp = head;
      int x = 0;
      if(head==null){
         System.out.print("\nList is empty");
      }
      else if(head.next==null){
         System.out.print("\nList Contains just one Node");

      }
      else{
         while(temp.next!=null && temp!=null){
            x = temp.data;
            Node temp2 = new Node();
            temp2 = temp;
            while(temp2.next!=null){
               if(x==temp2.next.data){
                  temp2.next = temp2.next.next;
               }
               
               else{
                  temp2= temp2.next;   
               }
                       
            }
            temp = temp.next;
         }
          
      }
       
   }
   
   //Lenght
   public static int lastIndex_node(Node n){
      int ctr = 0;
      while(n!=null){
         ctr = ctr+1;
         n=n.next;
      }
      
      return ctr-1;
   }
   
   //Getting the position first and last occurence of node
   public static void occur_f(int s){
      Node temp = new Node();
      temp = head;
      ArrayList<Integer> list = new ArrayList<Integer>();
      if(head==null){
         System.out.print("\nList is empty");
      }
      else if(head.next==null){
         if(head.data==s){
            System.out.print("\nOnly one Node present at Position 1");
         }
         else
            System.out.print("No occurence of "+s+" found");
      }
      else{
         int ctr = 1;
         int x = 0;
         while(temp.next!=null){
            if(s==temp.data){
               list.add(ctr);
               x=1;
            }
            ctr=ctr+1;
            temp=temp.next;
         }
         if(s==temp.data){
            list.add(ctr);
            x=1;
         }
         if(x==0){
            System.out.print("\nNo Occurence found");
         }
         if(list.size()==1){
            System.out.print("\nThe only occurence of "+s+" is at position :"+list.get(0)+"\n");
         }
         else if(list.size()>1){
            System.out.print("\nThe first occurence of "+s+" is at position :"+list.get(0)+"\n");
            System.out.print("\nThe last occurence of "+s+" is at position :"+list.get(list.size()-1)+"\n\n");
         }
         
      }
      
   }
   
   //SWAPPING 1ST AND LAST ELEMENT
   public static void swap(){
      Node temp = new Node();
      temp = head;
      if(head==null){
         System.out.print("\nList is empty");
      }
      else if(head.next==null){
         System.out.print("List contains only one element.");
      }
      else{
         while(temp.next!=null){
            temp=temp.next;
         }
         int num = temp.data;
         temp.data = head.data;
         head.data = num;
      }
   }
   
   //PAIRWISE SWAPPING OF NODES
   public static void swap_pair(){
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
   
   //Deleting the element at a given index
   public static void del_index(int index){
      Node temp = new Node();
      Node temp2 = new Node();
      temp = head;
      if(index<= lastIndex_node(temp) && index>=0){
         if(index==0){
            head = temp.next;
            temp.next = null;
         }
         if(index==1){
            temp = temp.next;
            head.next = temp.next;

         }
         else{
            for(int i = 0; i<=index-2 ; i++){
               temp = temp.next;
               if(i+2 == index){
                  temp2 = temp.next.next;
                  temp.next = temp2;
                  
               }
            }
         }
      }
      else
         System.out.print("\nIndex out of bounds\n");
   }
   
}


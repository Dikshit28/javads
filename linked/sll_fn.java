import java.util.*;
class Node{
   int data;
   Node next;
   Node(){
      this.data = 0;
      this.next = null;
   }
}
public class sll_fn{
   static Node head;
   public static void main(String args[]){
      while(3>1){
      int c= 0;
      char ch;
      Scanner sc = new Scanner(System.in);
      singly_LinketList sll = new singly_LinketList();
      System.out.print("\nEnter the size of linked list ");
      int s = sc.nextInt();
      for(int i = 0; i<s ; i++){
         System.out.print("\nEnetr element "+(i+1)+" : ");
         int x = sc.nextInt();
         node_end(x);
      }
      print_nodes();
      swap();
      print_nodes();
      swap_pair();
      print_nodes();
      System.out.print("\nEnter the number to get the firsta nd last occurence :");
      int y = sc.nextInt();
      occur_f(y);
      print_nodes();
      del_duplicate();
      print_nodes();
      del_alt();
      print_nodes();
      do{
         c=0;
         System.out.print("\nDo you want to quit?\nEnter Y or y for YES \nEnter N or n for NO ");
         ch = sc.next().charAt(0);
         if((ch!='Y' && ch!='y') && (ch!='N' && ch!='n')){
            System.out.print("\nINVALID INPUT");
            c=1;
         }
      }while(c==1);
      if(ch=='Y' || ch=='y')
         break;
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
   
   //Adding note at the end
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
   
   //SWAPPING 1ST AND LAST ELEMENT
   public static void swap(){
      System.out.print("\nSwapping 1st and Last Node \n");
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
   //Getting the position first and last occurence of node
   public static void occur_f(int s){
      System.out.print("\nGetting first and last occurence \n");
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
   
   //Deleting duplicates from unsorted list
   public static void del_duplicate(){
      System.out.print("\nDeleting duplicates from list \n");
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

   
   //Deleting alternate elements
   public static void del_alt(){
      System.out.print("\nDeleting alternate nodes \n");
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
   
   
}
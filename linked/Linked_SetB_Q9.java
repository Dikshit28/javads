import java.util.*;
public class Linked_SetB_Q9{
static Node head,head1;
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
   int size,element;
   System.out.println("Enter the number of elements of list: ");
   size=sc.nextInt();
   System.out.println("Elements of list: ");
   for(int i=0;i<size;i++){
      System.out.println("Enter the "+(i+1)+" position of element of list: ");
      element=sc.nextInt();
      last_node(element);
      }
    System.out.println("Enter the  position from which to rotaate: ");
     int  pos=sc.nextInt();
    rotate(pos,size);
    print_nodes();
    }
   public static void rotate(int rot,int size){
    Node temp = new Node();
      temp = head;
      int x[]=new int[size];
      for(int i=0;i<rot;i++){
         temp = temp.next;
      }
      int i=0;
      while(temp!=null){ 
       x[i]=temp.data;
       i=i+1;
       temp=temp.next;
      
    }
    temp=head;
    for(int j = 0; j<rot; j++){
      x[i]=temp.data;
      i=i+1;
      temp = temp.next;
    }
    for(int k = 0; k<size; k++){
      last_node(x[k],2);
    }
   }
   
 
 public static void print_nodes(){
      Node temp = new Node();
      temp = head1;
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
      public static void last_node(int value){
      Node new_node = new Node();
      new_node.data = value;
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
   
   
      public static void last_node(int value,int r){
      Node new_node = new Node();
      new_node.data = value;
      Node temp = new Node();
      temp = head1;
      if(head1==null){
         head1 = new_node;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = new_node; 
      }    
   }
   
   }
import java.util.*;
public class Linked_SetC_Q11{
   static Node head1,head2,head;
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int size,element;
      System.out.println("Enter the number of elements of list: ");
      size=sc.nextInt();
      int x[]=new int[size];
      System.out.println("Elements of list1: ");
      for(int i=0;i<size;i++){
        System.out.println("Enter the "+(i+1)+" position of element of list1: ");
        element=sc.nextInt();
         x[i]=element;
      }
      min_max(size,x);
      System.out.print("\nThe Sorted Nodes are as follows: ");
      print_nodes();
}
   public static void min_max(int size,int[] x){
      ArrayList<Integer> l = new ArrayList<Integer>();
      Arrays.sort(x);
      for(int p=0;p<size/2;p=p+1){
         l.add(x[p]);
         l.add(x[size-p-1]);
       }
      if(size%2!=0){
         l.add(x[size/2]);
       }
      for(int k = 0; k<size; k++){
        last_node(l.get(k));

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
   


}
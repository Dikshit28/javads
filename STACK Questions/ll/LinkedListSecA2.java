import java.util.*;
class node{
   int data;
   node next ;
   node(){
      data = 0;
      next = null;
   }
}
public class LinkedListSecA2{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      char ch ;
      do{
         System.out.print("Enter no. of elements of list:");
         int size = sc.nextInt();
         for(int i =0; i<size; i++){
            System.out.print("Enter "+(i+1)+" value:  ");
            int a = sc.nextInt();
            back(a);
         }
         System.out.print("Entered list:  ");
         print();
         System.out.print("Enter value to check the first and last occurence of entered element:  ");
         int a = sc.nextInt();
         occurence(a);
         System.out.print("After swapping first and last elements:  ");
         swapfl();
         print();
         System.out.print("After swapping pair wise:  ");
         swappair();
         print();
         System.out.print("After removing duplicate elements:  ");
         duplicate();
         print();
         System.out.print("After deleting alternate elements:  ");
         alternate();
         print();
         head = null;
         do{
            System.out.println("Do you want to continue? \nEnter Y or y to continue and N or n to exit.");
            ch = sc.next().charAt(0);
            if(ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n') System.out.println("Invalid input enter again.");
         }while(ch != 'Y' && ch != 'y' && ch != 'N' && ch != 'n');
      }while(ch == 'Y' || ch == 'y');
   }
   public static void back(int a){
      node n = new node();
      n.data = a;
      node temp = new node();
      temp = head;
      if(head == null){
         head = n;
      }
      else{
         while(temp.next!=null){
            temp = temp.next;
         }
         temp.next = n;
      }
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
   public static void swapfl(){
      node temp = new node();
      temp = head;
      if(head==null) System.out.println("List is empty.");
      else if (head.next==null) System.out.println("Size of list is 1 hence it can't be swap.");
      else{
         while(temp.next!=null){
            temp=temp.next;
         }
         int m = head.data;
         head.data=temp.data;
         temp.data = m;
      }
   }
   public static void swappair(){
      node temp = new node();
      temp = head;
      int m =0;
      if(head==null) System.out.println("List is empty.");
      else if (head.next==null) System.out.println("Size of list is 1 hence it can't be swap.");
      else{
         while(temp.next!=null && (temp.next).next!=null){
            m = temp.data;
            temp.data= (temp.next).data;
            (temp.next).data = m;
            temp=(temp.next).next;
         }
         if(temp.next!=null && (temp.next).next==null){
            m = temp.data;
            temp.data= (temp.next).data;
            (temp.next).data = m;
         }
      }
   }
   public static void occurence(int a){
      node temp = new node();
      temp = head;
      int r = 0;
      int j = 0;
      int m = -1;
      int n = -1;
      while(temp!=null ){
         if(temp.data==a){
            m=r;
            if(j==0){
               n=r;
               System.out.println("First index of element :  "+r);
               j++;
            }
         }
         r++;
         temp=temp.next;
      }
      if(m==-1){
         System.out.println("Entered element is not found.");
         m=0;
      }
      else if(m==n) System.out.println("Entered element occurs only once");
      else if(j==1 && m!=n) System.out.println("last index of element :  "+m);
   }
   public static void duplicate(){
      node temp = new node();
      
      if(head == null) System.out.println("List is empty");
      else if(head.next==null){}
      else{
         temp = head;
         while(temp.next!=null && temp!=null){
            int a = temp.data;
            node temp1=temp;
            while(temp1.next!=null){
               if(a == (temp1.next).data){
                  temp1.next=(temp1.next).next;
               }
               else temp1=temp1.next;
            }
            temp=temp.next;
         }
      }
   }
   public static void alternate(){
      node temp = new node();
      temp = head;
      if (head == null) System.out.println("List is empty.");
      else if(head.next == null) System.out.println("list contains only one element.");
      else{
         while(temp!= null && temp.next != null){
            temp.next = temp.next.next;
            temp = temp.next;
         }
      }
   }
}

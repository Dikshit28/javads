import java.util.*;
class node{
   int data;
   node next ;
   node(){
      data = 0;
      next = null;
   }
}
public class LinkedListMaking{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      do{
         System.out.println(" Enter 1  to add element in the Beginning.\n Enter 2 to add elements at the Last.\n Enter 3 to add in between by index number.\n Enter 4 to add in between by searching the element.\n Enter 5 to delete the first element.\n Enter 6 to delete the last element.\n Enter 7 to delete an element at specific location.\n Enter 8 to print list.\n Enter 9 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            front(a);
         }
         else if(choice==2){
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            back(a);
         }
         else if(choice==3){
            System.out.print("Enter index value:  ");
            int i = sc.nextInt();
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            midindex(i,a);
         }
         else if(choice==4){
            System.out.print("Enter element after which you want to add an element:  ");
            int i = sc.nextInt();
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            midvalue(i,a);
         }
         else if(choice==9) System.out.println("Program terminated.");
         else if(choice==8){
            print();
         }
         else if(choice==5){
            delStart();
         }
         else if(choice==6){
            delLast();
         }
         else if(choice==7){
            delSpecific();
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=9);
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
   public static void front(int a){
      node n = new node();
      n.data = a;
      n.next=head;
      head = n;
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
   public static void midindex(int j, int a){
      node n = new node();
      n.data = a;
      node temp = new node();
      temp = head;
      int r = 0;
      if(j==1){
         n.next=head;
         head = n;
         r=1;
      }
      if(j==2){
         n.next=head.next;
         head.next = n;
         r=1;
      }
      for(int i=0; i<j-2;i++){
         if(temp.next==null){
            System.out.println("Entered index is out of bound.");
            r =1;
            break;
         }
         else temp =temp.next;
      }
      if(r==0){
         n.next = temp.next;
         temp.next=n;
      }
   }
   public static void midvalue(int i, int a){
      node n = new node();
      n.data = a;
      node temp = new node();
      temp = head;
      int r = 0;
      while(temp.data!=i ){
         if(temp.next==null){
            r=1;
            System.out.println("Entered number not found in list.");
            break;
         }
         temp = temp.next;
      }
      if(r==0){
         n.next = temp.next;
         temp.next=n;
      }
   }
   public static void delStart(){
      node temp = new node();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else{
         head = head.next;
         temp.next = null;
      }
   }
   public static void delLast(){
      node temp = new node();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else if(head.next==null) head = null;
      else{
         while((temp.next).next!=null){
            temp = temp.next;
         }
         temp.next = null;
      }
   }
   public static void delSpecific(){
      node temp = new node();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else if(head.next==null) head = null;
      else{
         while((temp.next).next!=null){
            temp = temp.next;
         }
         temp.next = null;
      }
   }
}
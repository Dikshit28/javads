import java.util.*;
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
         System.out.println(" Enter 1  to add element in front.\n Enter 2 to add elements in back.\n Enter 3 to add in between by index number.\n Enter 4 to add in between with searching element.\n Enter 5 to delete an element from start.\n Enter 6 to delete an element from last.\n Enter 7 to delete an element at specific location.\n Enter 8 to print list.\n Enter 9 to exit.");
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
            System.out.print("Enter index of value you want to delete:  ");
            int a = sc.nextInt();
            delSpecific(a);
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
      if((head == null && j>1) || j<1){
         System.out.println("Index out of bound.");
         r=1;
      }
      else if(j==1){
         n.next=head;
         head = n;
         r=1;
      }
      else if(j==2){
         n.next=head.next;
         head.next = n;
         r=1;
      }
      else{
         for(int i=0; i<j-2;i++){
            if(temp.next==null || temp == null){
               System.out.println("Entered index is out of bound.");
               r =1;
               break;
            }
            else temp =temp.next;
         }
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
   public static void delSpecific(int j){
      node temp = new node();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else if(j ==1) head = head.next;
      else if (j>0){
         int r = 0;
         for(int i =0; i<j-2;i++){
            if(temp.next==null){
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
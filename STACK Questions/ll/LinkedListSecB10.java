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
public class LinkedListSecB10{
   static node head;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of list:  ");
      int size = sc.nextInt();
      for(int i =0; i<size; i++){
         System.out.print("Enter "+(i+1)+" value:  ");
         int a = sc.nextInt();
         back(a);
      }
      int choice = 0;
      do{
         System.out.println("\n Enter 1 to add in between by index number.\n Enter 2 to add in between with searching element.\n Enter 3 to delete an element at specific location.\n Enter 4 to print list.\n Enter 5 to exit.");
         choice = sc.nextInt();
         if(choice==1){
            System.out.print("Enter index value:  ");
            int i = sc.nextInt();
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            midindex(i,a);
         }
         else if(choice==2){
            System.out.print("Enter element after which you want to add an element:  ");
            int i = sc.nextInt();
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            midvalue(i,a);
         }
         else if(choice==5) System.out.println("Program terminated.");
         else if(choice==4){
            print();
         }
         else if(choice==3){
            System.out.print("Enter index of value you want to delete:  ");
            int a = sc.nextInt();
            delSpecific(a);
         }
         else System.out.println("Invalid Input, Enter again ");
      }while(choice!=5);
   }
   public static void back(int a){
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
         if(head.next == null) head.next = head;
         r=1;
      }
      else if(j==2){
         n.next=head.next;
         head.next = n;
         r=1;
      }
      else{
         for(int i=0; i<j-2;i++){
            if(temp.next==head){
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
         if(temp.next==head){
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
   public static void delSpecific(int j){
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
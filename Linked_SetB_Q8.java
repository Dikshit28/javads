import java.util.*;
class Node_Dou{
   int data;
   Node_Dou next ;
   Node_Dou pre ;
   Node_Dou(){
      data = 0;
      next = null;
      pre = null;
   }
}
public class Linked_SetB_Q8{
   static Node_Dou head;
   static Node_Dou tail;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
       do{
         System.out.println(" Enter 1  to add element in front.\n Enter 2 to add elements in back.\n Enter 3 to add in between by index number.\n Enter 4 to add in between with searching element.\n Enter 5 to delete an element from start.\n Enter 6 to delete an element from last.\n Enter 7 to delete an element at specific location.\n Enter 8 to print list in forward direction.\n Enter 9 to print list in Reverse direction.\n Enter 10 to exit.");
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
         else if(choice==10) System.out.println("Program terminated.");
         else if(choice==8){
            printForward();
         }
         else if(choice==5){
            delStart();
         }
         else if(choice==9){
            printReverse();
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
      }while(choice!=10);
   }
   public static void back(int a){
      Node_Dou n = new Node_Dou();
      n.data = a;
      if(head == null){
         head = n;
         tail = n;
      }
      else{
         tail.next = n;
         n.pre= tail;
         tail = tail.next;
      }
   }
   public static void printForward(){
      Node_Dou temp = new Node_Dou();
      temp = head;
      if(head == null) System.out.println("List is empty.");
      else{
         while(temp!=tail){
            System.out.print(temp.data+"  ");
            temp = temp.next;
         }
         System.out.print(tail.data);
         System.out.println();
      }
   }
   public static void printReverse(){
      Node_Dou temp = new Node_Dou();
      temp = tail;
      if(head == null) System.out.println("List is empty.");
      else{
         while(temp!=head){
            System.out.print(temp.data+"  ");
            temp = temp.pre;
         }
         System.out.print(head.data);
         System.out.println();
      }
   }
   public static void front(int a){
      Node_Dou n = new Node_Dou();
      n.data = a;
      n.next=head;
      n.pre =null;
      head.pre = n;
      head = n;
      if(head.next==null) tail = n;
   }
   public static void midindex(int j, int a){
      Node_Dou n = new Node_Dou();
      n.data = a;
      Node_Dou temp = new Node_Dou();
      temp = head;
      int r = 0;
      if((head == null && j>1) || j<1){
         System.out.println("Index out of bound.");
         r=1;
      }
      else if(j==1){
         n.next=head;
         n.pre = null;
         if(head!=null) head.pre=n;
         head = n;
         if(head.next==null) tail = n;
         r=1;
      }
      else if(j==2){
         n.next=head.next;
         n.pre = head;
         (head.next).pre = n;
         head.next = n;
         if(n.next==null) tail=n;
         r=1;
      }
      else{
         for(int i=0; i<j-2;i++){
            if(temp.next==null){
               System.out.println("Entered index is out of bound.");
               r =1;
               break;
            }
            else temp =temp.next;
         }
      }
      if(r==0){
         n.next = temp.next;
         n.pre = temp;
         if(temp!= tail) (temp.next).pre =n;
         temp.next=n;
         if(temp == tail) tail = n;
      }
   }
   public static void midvalue(int i, int a){
      Node_Dou n = new Node_Dou();
      n.data = a;
      Node_Dou temp = new Node_Dou();
      temp = head;
      int r = 0;
      if(head==null){
         System.out.println("List is empty.");
         r=1;
      }
      else{
         while(temp.data!=i ){
            if(temp.next==null){
               r=1;
               System.out.println("Entered number not found in list.");
               break;
            }
            temp = temp.next;
         }
      }   
      if(r==0){
         n.next = temp.next;
         n.pre = temp;
         if(temp!= tail) (temp.next).pre =n;
         temp.next=n;
         if(temp == tail) tail = n;
      }
   }
   public static void delStart(){
      if(head==null) System.out.println(" List is empty.");
      else if(head==tail){
         head = null;
         tail = null;
      }
      else{
         head = head.next;
         head.pre = null;
      }
   }
   public static void delLast(){
      Node_Dou temp = new Node_Dou();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else if(head==tail){
         head = null;
         tail = null;
      }
      else{
         tail = tail.pre;
         tail.next = null;
      }
   }
   public static void delSpecific(int j){
      Node_Dou temp = new Node_Dou();
      temp = head;
      if(head==null) System.out.println(" List is empty.");
      else if(j ==1){
         if(head==tail) tail = null;
         head = head.next;
      }
      else if(j==2 && head == tail){
         System.out.println("Entered index is out of bound.");
      }         
      else if (j>1){
         int r = 0;
         for(int i =0; i<j-2;i++){
            if(temp.next==null || (temp.next.next==null)){
               System.out.println("Entered index is out of bound.");
               r=1;
               break;
            }
            else{
               temp=temp.next;
            }
         }
         if (r==0){
            if(temp.next == tail) tail = temp;
            else temp.next.next.pre = temp;
            temp.next= (temp.next).next;
         }
      }
   }
}

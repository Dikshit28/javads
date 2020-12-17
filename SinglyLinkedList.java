import java.util.*;
class Node {
	public int data;
	public Node next;
   Node(){
      data = 0;
      next = null;
   }
}
 
public class SinglyLinkedList {
	static Node head;
 
	public boolean isEmpty() {
		return (head == null);
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
 
	// used to insert a node at the start of linked list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
 
	// used to delete node from start of linked list
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}
   // used to insert node at indexvalue
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

 
	// Use to delete node after particular node
	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}
 
	// used to insert a node at the last of linked list
	public void insertLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
   // used to add element after an enetred value
   public static void midvalue(int i, int a){
      Node n = new Node();
      n.data = a;
      Node temp = new Node();
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
   
   //adding after an index
   public static void midindex(int j, int a){
      Node n = new Node();
      n.data = a;
      Node temp = new Node();
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
 
	// For printing Linked List
	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
   
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      do{
         System.out.println(" Enter 1  to add element in the Beginning.\n Enter 2 to add elements at the Last.\n Enter 3 to add in between by index number.\n Enter 4 to add in between by searching the element.\n Enter 5 to delete the first element.\n Enter 6 to delete the last element.\n Enter 7 to delete an element at specific location.\n Enter 8 to print list.\n Enter 9 to exit.");
          choice = sc.nextInt();
         if(choice==1){
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            insertFirst(a);
         }
         else if(choice==2){
            System.out.print("Enter value:  ");
            int a = sc.nextInt();
            insertLast(a);
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
            printLinkedList();
         }
         else if(choice==5){
            deleteFirst();
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
    }

 
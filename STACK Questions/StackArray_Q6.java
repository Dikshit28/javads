import java.util.Scanner;
public class StackArray_Q6 
{
  node head;
  int top;
  class node
  {
    int data;
    node next;
  }
  public void push (int data)
  {
    node nn = new node ();
      nn.data = data;
    if (this.head == null)
      {
	this.head = nn;
	nn.next = null;
      }
    else
      {
	nn.next = this.head;
	this.head = nn;
      }
    this.top++;
  }

  public void pops(int item)
  {
    if (this.head == null)
      {
	System.out.println ("Nothing to remove");
      }
        node temp=this.head;
    	if(this.head.data==item)
        {
    	  this.head=temp.next;
        }
    	else
    	{
    	 temp=this.head;
    	while(temp.next.data!=item)
         {
        	 temp=temp.next;
         }
         temp.next=temp.next.next;
         }
    this.top--;
  }

  public void display()
  {

    if (this.head == null)
      {
	System.out.println ("stack is empty");
      }
    else
      {
	node temp = this.head;
	 System.out.print("top\n");
	while (temp!= null)
	  {
	    System.out.print(temp.data+"<-");
        temp=temp.next;
	  }
      }
  }
public void oddrev()
  { 
	  if(this.head==null)
	  {
		  System.out.println("Stack is empty");
	  }
	  else
	  {
	     node temp=this.head;
	     temp=this.head;
		  while(temp!=null)
		  { 
			  if(temp.data%2==1)
			  {
				 pops(temp.data);
			  }
			  temp=temp.next;
		  }
	  }
	  }
  public int peek()
  {
	  return this.head.data;
  }


  public static void main (String[]args)
  {
	 StackArray_Q6  ob = new StackArray_Q6();
    Scanner s=new Scanner(System.in);
    ob.push(20);ob.push(23);ob.push(24);ob.push(33);ob.push(37);ob.push(48);ob.push(100);ob.push(47);
    ob.display();
    ob.oddrev();
    System.out.println("\nodd removed");
    ob.display();
  }
}

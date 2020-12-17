package stack;
class question1
{
	private int[] data;
	private int top;
    public static final int max=10;
    public question1() throws Exception
    {
    	this(max);
    }
    public  question1(int max) throws Exception
    {
    	if(max<1)
    	{
    		throw new Exception("Invalid capacity");
    	}
    	this.data=new int[max];
    	this.top=-1;
    	
    }
    public int size()
    {
    	return this.top+1;
    }
    public boolean isEmpty()
    {
    	return this.size()==0;
    }
    public void push(int value) throws Exception
    {
    	if(this.size()==this.data.length)
    	{
    		throw new Exception("Stack is full");
    	}
    	this.top++;
    	this.data[this.top]=value;
    }
    public int pop() throws Exception
    {
    	if(this.size()==0)
    	{
    		throw new Exception("Stack is Empty");
    	}
    	int rev=this.data[this.top];
    	this.data[this.top]=0;
    	this.top--;
    	return rev;
    }
    public int top() throws Exception
    {
    	if(this.size()==0)
    	{
    		throw new Exception("Stack is Empty");
    	}
    	int rev=this.data[this.top];
    	return rev;
    }
    public void display() throws Exception
    {
    	if(this.size()==0)
    	{
    		throw new Exception("Stack is Empty");
    	}
    	for(int i=this.top;i>=0;i--)
    	{
    		System.out.println(data[i]);
    	}
    }
}


public class Stackusingarrays 
{

	public static void main(String[] args) throws Exception 
	{
		question1 q=new question1();
         q.push(10);
         q.push(20);
         q.push(30);
         q.display();
         int  x=q.pop();
         System.out.println(x+"--removed");
         x=q.top();
         System.out.println(x+"--top");
	}
}

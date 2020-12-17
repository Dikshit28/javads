import java.util.*;
public class StackTest{
   public static void main(String[] args){
      Stack<Integer> stackOne = new Stack<Integer>();
      Stack<Integer> stackTwo = new Stack<Integer>();
      for(int i =0; i<5; i++) stackOne.push(i);
      stackTwo.push(stackOne.pop());
      stackTwo.push(stackOne.pop());
      stackTwo.push(stackOne.pop());
      System.out.println(""+stackOne.peek());
      System.out.println(""+stackTwo.peek());
      
   }
}
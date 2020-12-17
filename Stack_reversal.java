import java.util.*;
class Stack_reversal{
   public static void main(String args[]){
      String sentence = "AB DE VILLIERS IS THE BEST .";
      Stack<String> stack = new Stack<String>();
      String[] s = sentence.split(" ");
      for(int i = 0; i<s.length; i++){
         stack.push(s[i]);
      }
      for(int i = 0; i<s.length; i++){
         System.out.print(stack.pop()+" ");
      }
   }
}
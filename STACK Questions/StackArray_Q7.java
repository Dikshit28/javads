import java.util.*;
class StackArray_Q7{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter infix value :  ");
      String st = sc.next();
      String[] str = st.split("");
      infix_postfix(str);


      
   }
    public static void pop(String array[]){
      if(top==-1){
         System.out.println("Stack underflow!!!");
      }
      else{
         top--;
      }
   }
   public static void push(String a,String array[]){
      top++;
      array[top] = a;
   }
   public static void peep(int array[]){
      if(top==-1){
         System.out.println("Stack underflow!!!");
      }
      else{
         System.out.println(array[top]);
      }
   }
   public static void print(int array[]){
      if(top==-1) System.out.println("Empty Stack.");
      else{
         for(int i = top; i>=0; i--){
            System.out.print(array[i]+" ");
         }
         System.out.println();
      }
   } 
}
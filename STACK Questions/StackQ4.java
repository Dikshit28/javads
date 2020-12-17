import java.util.*;
class StackQ4{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string of brackets :  ");
      String st = sc.next();
      String[] str = st.split("");
      String[] array = new String[str.length];
      check(str,array);
   }
   public static void check(String[] str, String[] array){
      for(int i = 0; i<str.length;i++){
         if(str[i].equals("(") || str[i].equals("[") || str[i].equals("{")){
            push(str[i],array);
         }
         else if(str[i].equals(")")){
            if(array[top].equals("(")) pop(array);
            else{
               System.out.println("Not Balanced");
               System.exit(0);
            }
         }
         else if(str[i].equals("]")){
            if(array[top].equals("[")) pop(array);
            else{
               System.out.println("Not Balanced");
               System.exit(0);
            }
         }
         else if(str[i].equals("}")){
            if(array[top].equals("{")) pop(array);
            else{
               System.out.println("Not Balanced");
               System.exit(0);
            }
         }
      }
      if(top==-1) System.out.println("Balanced");
      else System.out.println("Not balanced");
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
}
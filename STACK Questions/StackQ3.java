import java.util.*;
class StackQ3{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string :  ");
      String st = sc.nextLine();
      String[] str = st.split(" ");
      String[] array = new String[str.length];
      for(int i = 0; i<str.length;i++){
         push(str[i],array);
      }
      print(array);
   }
   public static void push(String a,String array[]){
      top++;
      array[top] = a;
   }
   public static void print(String array[]){
      if(top==-1) System.out.println("Empty Stack.");
      else{
         for(int i = top; i>=0; i--){
            System.out.print(array[i]+" ");
         }
         System.out.println();
      }
   } 
}
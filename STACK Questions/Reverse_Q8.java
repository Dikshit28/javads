import java.util.*;
class ReverseIndi{
   static int top =-1;
   public static void main(String args[]){
      String result = "";
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter String:  ");
      String str = sc.nextLine();
      String[] array = new String[str.length()];
      String[] str1= str.split(" ");
      for(int i = 0; i<str1.length; i++){
         String[] str2 = str1[i].split("");
         for(int j = 0; j<str2.length; j++){
            push(str2[j],array);
         }
         while(top>=0){
            result = result+array[top];
            pop(array);
         }
         result = result+" ";
      }
      System.out.println(result);
   }
   public static void push(String a,String array[]){
      if(top==array.length-1){
         System.out.println("Stack overflow!!!");
      }
      else{
         top++;
         array[top] = a;
      }
   }
   public static void pop(String array[]){
      if(top==-1){
         System.out.println("Stack underflow!!!");
      }
      else{
         top--;
      }
   }
}
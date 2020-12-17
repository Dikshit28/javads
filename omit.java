import java.util.*;
public class omit{
   public static void main(String args[]){
      System.out.print("Enter two strings : \n");
      Scanner sc = new Scanner(System.in);
      String s1 = sc.next();
      System.out.print("\n");
      String s2 = sc.next();
      omit o = new omit();
      o.nonStart(s1,s2);
   }
   
   public void nonStart(String s1 , String s2){
      System.out.print("\n"+ s1.substring(1,s1.length()) + s2.substring(1,s2.length()));
   }
}
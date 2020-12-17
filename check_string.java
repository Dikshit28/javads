import java.util.*;
public class check_string{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st String : ");
      String a = sc.next();
      System.out.print("\nEnter 2nd String : ");
      String b = sc.next();
      int ctr = 0;
      int x = a.length();
      int y = b.length();
      int z = Math.min(x,y);
      for(int i = 0; i<z-1; i++){
         String one = a.substring(i,i+2);
         String two = b.substring(i,i+2);
         if(one.equals(two)){
            ctr = ctr+1;
         }
      }
      System.out.print("\nThe number of the positions where they contain the same length 2 substring is : "+ctr);
   }
}

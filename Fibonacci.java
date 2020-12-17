import java.util.*;
public class Fibonacci {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of terms : ");
      int n = sc.nextInt();
      int t1 = 0; 
      int t2 = 1;
      System.out.print("First " + n + " terms: ");
      for (int i = 0; i <n; i++)
      {
         System.out.print(t1 + "  ");
         int sum = t1 + t2;
         t1 = t2;
         t2 = sum;
      }
    }
}
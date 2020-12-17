import java.util.*;
public class Stack_Q5{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the number of disks: ");
      int n = sc.nextInt();
      t(n,'A','B','C');
   }
   public static void t(int n, char Begin, char Aux, char End){
      if(n==1){
         System.out.print("\n"+Begin+"-->"+End);
      }
      else{
         t(n-1,Begin,End,Aux);
         System.out.print("\n"+Begin+"-->"+End);
         t(n-1,Aux,Begin,End);
      }
   }
   
}
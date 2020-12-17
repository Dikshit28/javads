import java.util.*;
import java.lang.Math; 
public class quad{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("This is a quadratic equation : ax^2+bx+c\nEnter the value of \"a\": ");
     double a = sc.nextDouble();
     System.out.print("\nEnter the value of \"b\": ");
     double b = sc.nextDouble();
     System.out.print("\nEnter the value of \"c\": ");
     int c = sc.nextInt();
     double det = (b*b)-(4*a*c);
     String eq = a+"x^2+("+b+")x+("+c+")";
     if(det>=0){
      double r1 = (-b+(Math.pow(det,0.5)))/(2*a);
      double r2 = (-b-(Math.pow(det,0.5)))/(2*a);
      System.out.println("\nThe roots of the equation "+eq+" are : "+r1+" and "+r2);
     }
     else
      System.out.print("\nNo real roots exists");

   }
}
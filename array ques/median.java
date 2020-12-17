//Q8 Array
import java.util.*;
class median{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements of array");
      for (int i=0; i<n;i++){
         System.out.print("Enter "+(i+1)+" element:  ");
         a[i]= sc.nextInt();
      }
      double med =0;
      Arrays.sort(a);
      if(n%2==0){
         med = (a[n/2]+a[(n/2)-1])/2.0;
      }
      else med = a[(n-1)/2];
      System.out.println("Median of inserted array:  "+med);
   }
}
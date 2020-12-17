import java.util.*;
public class npt{
   public static void main(String args[]){
      int a[] = {1,2,3,4,5};
      int i = ++a[1];
      int j = a[1]++;
      int m = a[i++];
      System.out.print(""+i+j+m);
   }
}
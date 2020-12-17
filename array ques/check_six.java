//Q6 Array
import java.util.*;
public class check_six{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int [] arr1 = {6,7,2,6};
      int ctr = 0;
      for(int i=0; i<arr1.length-1; i++){
         if(arr1[i] == 6 && (arr1[i+1] == 6 || arr1[i+1] == 7)){
            ctr= ctr+1;
         }
      }
      System.out.print("\nThe number of times that two 6's or 6 and 7 are next to each other is: " + ctr);
   }
}

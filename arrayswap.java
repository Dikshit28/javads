import java.util.*;
public class arrayswap{
   public static void main(String args[]){
   int[] array1 = {1, 2, 3, 4, 5, 6};
   System.out.println("The array without swapping is : "+Arrays.toString(array1));
   int array2 = array1[0];
   array1[0] = array1[array1.length - 1];
   array1[array1.length-1] = array2;
   System.out.println("The array after swapping is : "+Arrays.toString(array1));
   
   }
}   
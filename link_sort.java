import java.util.*;
public class link_sort{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of linked list : ");
      int size = sc.nextInt();
      int a[] = new int[size];
      LinkedList<Integer> l = new LinkedList<Integer>();
      LinkedList<Integer> l1 = new LinkedList<Integer>();
      System.out.print("\nEnter the elements in the list");
      for(int i =0 ; i<size ; i++){
         System.out.print("\nEnter element "+(i+1)+ " ");
         a[i] = sc.nextInt();
         l.add(a[i]);
      }
      System.out.print("\nThe entered elemts in the list are :"+l);
      Arrays.sort(a);
      int new_array[] = new int[size];
      new_array[0] = a[0];
      new_array[1] = a[size-1];
      l.set(0,a[0]);
      l.set(1,a[size-1]);
      int j = 0;
      for(j = 0 ; j<size/2 ; j++){
         l1.add(a[j]);
         l1.add(a[size-j-1]);
      } 
      if(size%2!=0){
         l1.add(a[size/2]);
      }

      System.out.print("\nThe sorted elements are :"+l1);
   }
}
//Q1 Array
import java.util.*; 
public class diff_array{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      int size = sc.nextInt();
      int a[] = new int[size];
      for (int i=0;i<size;i++){
         System.out.print("\nEnter element "+(i+1)+" :");
         a[i] = sc.nextInt();
      }
	   System.out.print("\nOriginal Array: "+Arrays.toString(a)); 
	   int max = a[0];
	   int min = a[0];
	   for(int i = 1; i < a.length; i++){
		   if(a[i] > max){
		   	max = a[i];
         }   
		   else if(a[i] < min){
		   	min = a[i];
         }   
	   }
      System.out.print("\nThe largest element is : "+max+"\nThe smallest element is : "+min);
	   System.out.print("\nDifference between the largest and smallest values of the said array: "+(max-min));	
   }
}
import java.util.*;
class SelectionSort{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter size of an array : ");
      int l = sc.nextInt();
      int arr[] = new int[l];
      System.out.println("Enter elements of array");
      for(int i=0; i<l ; i++){
         System.out.print((i+1)+"  :  ");
         arr[i] = sc.nextInt();
      }
      selectionSort(arr);
      for(int i=0; i<l ; i++){
         System.out.print(arr[i]+"  ");
      }
   }
   public static void selectionSort(int[] arr){
      int l = arr.length;
      for(int i=0; i<l-1 ; i++){
         int a = min(i,l,arr);
         int temp = arr[a]; 
         arr[a] = arr[i]; 
         arr[i] = temp;
      }
   }
   public static int min(int n , int l , int[] arr){
      int a = n; 
      for (int j = n+1; j < l; j++) 
          if (arr[j] < arr[a]) 
              a = j;
      return a;
   }
}
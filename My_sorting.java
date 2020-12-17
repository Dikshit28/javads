import java.util.*;
public class My_sorting{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      do{
         choice = 0;
         System.out.print("\nEnter the size of your list : ");
         int size = sc.nextInt();
         int arr[] = new int[size];
         int arr2[] = new int[size];
         int max = 0;
         int num = 0;
         int x = 0;
         int y = 0;
         
         for(int i = 0; i<size; i++){
            System.out.print("\nEnter element no "+(i+1)+" : ");
            arr[i] = sc.nextInt();
         }
         while(num!=size){
          max = arr[0];
          for(int i = 0; i<size; i++){
             if(arr[i]>=max){
                max = arr[i]; 
                y=i;
             }
          }
          arr2[x] = max;
          x=x+1;
          arr[y] = -10000; 
          num = num+1;
         }
         System.out.print("\nTHE SORTED LIST IS :\n");
         for(int i = size-1; i>=0 ; i--){
            System.out.print(arr2[i]+" ");
         }
         
         System.out.print("\nDo you wish to continue?\nPress 1 to continue else to exit: ");
         choice = sc.nextInt();
         
      }while(choice==1);   
   }
}
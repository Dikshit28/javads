import java.util.*;
class Quicksort{
static int c = 0;
   public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     int beg = 0;
     int end;
     System.out.print("Enter size of an array : ");
     int l = sc.nextInt();
     end = l-1;
     int arr[] = new int[l];
     System.out.println("Enter elements of array");
     
     for(int i=0; i<l ; i++){
        System.out.print((i+1)+"  :  ");
        arr[i] = sc.nextInt();
     }
     
     System.out.println("Entered elements without sorting");
     for(int i=0; i<l ; i++){
         System.out.print(arr[i]+"  ");
     }
     
     System.out.println("Entered elements after sorting");
     quick_sort(arr,beg,end);
     for(int i=0; i<arr.length ; i++){
       System.out.print(arr[i]+"  ");
     } 
   

   }
   
   public static void quick_sort(int []arr,int beg,int end){
      if(beg<end){
         int num = partition(arr,beg,end);
         quick_sort(arr,beg,num-1);
         quick_sort(arr,num+1,end);  
      }   
      

   }
   
   public static int partition(int arr[], int beg, int end){
      int loc = beg;
      int l = beg;
      int r = end;
      int flag = 0;
      while(flag==0){
         while(arr[loc]<=arr[r] && loc!=r){
            r=r-1;
         }
         if(loc==r){
         
            flag=100;
         }
         else if(arr[loc]>arr[r]){
            int temp = arr[loc];
            arr[loc] = arr[r];
            arr[r] = temp;
            loc=r;
         }
         
         if(flag==0){
            while(arr[loc]>=arr[l] && loc!=l){
            l=l+1;
         }
         if(loc==l){
         
            flag=100;
         }
         else if(arr[loc]<arr[l]){
            int temp = arr[loc];
            arr[loc] = arr[l];
            arr[l] = temp;
            loc=l;
         }
         }
      }
      return loc;
      
   }
}

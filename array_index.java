import java.util.*;
public class array_index{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a[] = new int[20] ;
      a[0] = 10;a[1] = 20;a[2] = 30;a[3] = 40;a[4] = 50;a[5] = 60;a[6] = 70;a[7] = 80;a[8] = 90;a[9] = 100;
      System.out.print("Enter the number you want to add ");
      int num = sc.nextInt();
      int x;
      int pos=0;
      do{
       x=0;
       System.out.print("\nEnter the number after which you want to add ");
       
       int num1 = sc.nextInt();
       for(int i = 0; i<a.length-1;i++){
          if(num1 == a[i]){
             pos = i;
             continue;
          }
          else
            x++;
             
        }
        if(x==(19)){
         System.out.print("\n OOPS Number NOT FOUND! Enter again : ");
        }
       }while (x==(19));
      for(int i = 0; i<=pos; i++){
         System.out.print(" "+a[i]+" ");
         
      }
      System.out.print(num);
     
      for(int j= pos ; j<a.length-1 ;j++){
         System.out.print(" "+a[j+1]);
      }
      

      
   }
}
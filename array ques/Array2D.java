//Q5 Array
import java.util.*;
class Array2D{
   public static void main(String args[]){
      int r[][]=new int[3][3];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the elements of array.");
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            System.out.print("r["+(i+1)+"]["+(j+1)+"] = ");
            do{
               r[i][j]=sc.nextInt();
               if(r[i][j]<-99 || r[i][j]>99){
                  System.out.println("Entered number is not two or one digit number.\nAgain enter the number.");
               }
            }while(r[i][j]<-99 || r[i][j]>99);
         }
      }
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            System.out.print(r[i][j]+"  ");
            if(j==2){
               System.out.print("\n");
            }
         }
      }
      System.out.print("Array after odd number multiplied by 2.\n");
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            if(r[i][j]%2!=0){
               r[i][j]=r[i][j]*2;
            }
            else 
               continue;
         }
      }
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            System.out.print(r[i][j]+"  ");
            if(j==2){
               System.out.print("\n");
            }
         }
      }
   }
}
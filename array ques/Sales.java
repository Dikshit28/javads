//Q12 Array
import java.util.*;
class Sales{
   public static void main(String args[]){
      int n=0,s,d;
      Scanner sc=new Scanner(System.in);
      int sales[][]=new int[5][6];
      int no[][]=new int[5][6];
      int num[]=new int[30];
      for(int i=0;i<4;i++){
         System.out.println("Enter the last week sale of salesperson number "+(i+1)+" :");
         for(int j=0;j<5;j++){
            System.out.print("Enter last week sale of product "+(j+1)+" :");
            sales[i][j]=sc.nextInt();
         }
      }
      for(int i=0;i<4;i++){
         int sum=0;
         for(int j=0;j<5;j++){
            sum=sum+(sales[i][j]);
         }
         sales[i][5]=sum;
      }
      for(int i=0;i<5;i++){
         int sum=0;
         for(int j=0;j<4;j++){
            sum=sum+(sales[j][i]);
         }
         sales[4][i]=sum;
      }
      for( int i=0;i<5;i++){
         for( int j=0;j<6;j++){
            no[i][j]=sales[i][j];
         }
      }
      int p=0;
      for( int j=0;j<6;j++){
         for( int i=0;i<5;i++){
            int ctr=0;
            while(no[i][j]>0){
               no[i][j]=no[i][j]/10;
               ctr++;
            }
            num[p]=ctr;
            p++;
         }
      }
      System.out.println("Product\\Salesperson     Person  1  Person  2  Person  3  Person  4  Total Product's ");
      System.out.println("number  number                                                            sale");
      for(int j=0;j<6;j++){
         if(j<5){
            System.out.print("      "+(j+1)+"                 ");
         }
         else{
            System.out.print("Total salesPerson sale  ");
         }
         for(int i=0;i<5;i++){
            if(i==4 && j==5){
               System.out.print(" ");
            }
            else{
               System.out.print(sales[i][j]+"  ");
               int h=9-num[n];
               while(h>0){
                  System.out.print(" ");
                  h--;
               }
            }
            if(i==4){
               System.out.print("\n");
            }
            n++;
         }
      }
   }
}
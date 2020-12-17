//Q2 Array
import java.util.*;
class Arrayp{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       System.out.println("Enter the elements of array");
       for (int i=0; i<10;i++){
          System.out.print("Enter "+(i+1)+" element:  ");
          a[i]= sc.nextInt();
       }
       System.out.println("Elements at even places.");
       for (int i=0; i<10;i++){
          if(i%2!=0) System.out.print(a[i]+"  ");
       }
       System.out.println("");
       System.out.println("All odd elements.");
       for (int i=0; i<10;i++){
          if(a[i]%2!=0) System.out.print(a[i]+"  ");
       }
       System.out.println("");
       System.out.println("Array in reverse order.");
       for (int i=9; i>=0;i--){
         System.out.print(a[i]+"  ");
       }
       System.out.println("");
       System.out.println("Last Element : "+a[9]);
       System.out.println("First Element : "+a[0]);
    }
}

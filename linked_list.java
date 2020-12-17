import java.util.LinkedList;
import java.util.*;

import java.util.ListIterator;

public class linked_list{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      LinkedList<String> ar1  = new LinkedList<String>();
      LinkedList<String> ar2  = new LinkedList<String>();
      LinkedList<String> ar3  = new LinkedList<String>();
      LinkedList<String> ar4  = new LinkedList<String>();
      LinkedList<String> ar5  = new LinkedList<String>();
      String a[] = new String[5];
      a[0] = "Arijit";
      a[1] = "Sunidhi";
      a[2] = "Benny";
      a[3] = "Neeti";
      a[4] = "Sonu";
      int i = 0;
      for(i = 0 ; i<5 ; i++){
         System.out.print("\nEnter the no.of songs to be entered of "+a[i]+" : ");
         int num = sc.nextInt();
         sc.nextLine();
         String song[] = new String[num];
         for(int j = 0 ; j<num ; j++){
            System.out.print("\nEnter the songs to be entered of "+a[i]+": Song number"+(j+1)+" -");
            String s = sc.nextLine();
            if(i==0){
               ar1.add(s);
            }
            else if(i==1){
               ar2.add(s);
            }
            else if(i==2){
               ar3.add(s);
            }
            else if(i==3){
               ar4.add(s);
            }
            else if(i==4){
               ar5.add(s);
            }
               
         }
         
      }
      System.out.print("\nEnter the name of artist to get the list of songs :");
      String ar_name = sc.next();
      if(ar_name.equalsIgnoreCase(a[0])){
         System.out.print("\n"+ar1);
      }   
      else if(ar_name.equalsIgnoreCase(a[1])){
         System.out.print("\n"+ar2);
      }
      else if(ar_name.equalsIgnoreCase(a[2])){
         System.out.print("\n"+ar3);
      }
      else if(ar_name.equalsIgnoreCase(a[3])){
         System.out.print("\n"+ar4);
      }
      else if(ar_name.equalsIgnoreCase(a[4])){
         System.out.print("\n"+ar5);
      }
      else
         System.out.print("\nWrong Input");


   }
}


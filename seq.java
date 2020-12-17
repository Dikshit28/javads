import java.util.*;
public class seq{
   public static void main(String args[]){
      int a[] = {1,1,1,5,3,4,5};
      int ctr = 0;
      for(int i = 0; i<a.length; i++){
         ctr= ctr+1;
         if(a[i]==1 && a[i+1]==2 && a[i+2]==3){
            System.out.print(" true");
            ctr = 1;
            break;
         }
         if(ctr == a.length){
            System.out.print(" false");
         }
      }
      
   }
}
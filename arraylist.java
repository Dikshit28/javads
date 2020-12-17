import java.util.*;
public class arraylist{
   public static void main(String args[]){
      ArrayList<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      int ctr = 0;
      do{
         System.out.println(" Enter 1 to ADD a string.");
         System.out.println(" Enter 2 to DELETE element from list.");
         System.out.println(" Enter 3 to DISPLAY list.");
         System.out.print(" Enter 4 to EXIT. ");
         System.out.print("\nEnter your choice :");
         ctr = sc.nextInt();
         if(ctr==1){
            System.out.print("Enter a string:  ");
            String s = sc.next();
            list.add(s);
         }
         else if(ctr==2){
            System.out.print("Enter a index value:  ");
            int i = sc.nextInt();
            list.remove(i);
         }
         else if(ctr==3){
            System.out.println("\n\nElements of list are :");
            System.out.println(list);
         }
         
         else if(ctr==4){
            System.exit(0);
         }
         else{
            System.out.print("\nInvalid input. Enter again.\n");
            ctr = 100;
         }
      }while(ctr==100|| ctr==1 || ctr==2 || ctr==3);
   }
}
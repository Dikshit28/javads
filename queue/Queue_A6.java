import java.util.*;
class Queue_A6{
   static int last = -1;
   static int first = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String[] array = new String[100];
      System.out.print(" Enter the string : ");
      String st = sc.nextLine();
      String[] str = st.split(" ");
      System.out.println("Entered string");
      System.out.println(st);
      for(String i : str){
         enqueue(i,array);
      }
      reverse(array);
   }
   public static void enqueue(String a,String array[]){
      if(last == -1){
         last ++;
         first ++;
         array[first] = a;
      }
      else{
         last++;
         array[last] = a;
      }
   }
   public static void reverse(String array[]){
      String result = "";
      if(first==-1) System.out.println("Empty Queue.");
      else{
         for(int i = first; i<=last; i++){
            result = dequeue(array)+" "+result;
         }
      }
      System.out.println("Reversed String");
      System.out.println(result);
   } 
    public static String dequeue(String array[]){
      if(first == last){
         String a = array[first];
         first=-1;
         last = -1;
         return a;
      }
      else{
         String a = array[first];
         first++;
         return a;
      }
   }
}
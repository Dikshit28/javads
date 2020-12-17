import java.util.*;
public class morse{
   public static String morse_code(char ch){
      switch(ch){
         case 'a':
            return ".-   ";
         case 'b':
            return "-...    ";  
         case 'c':
            return "-.-.    "; 
         case 'd':
            return "-..   "; 
         case 'e':
            return ".   "; 
         case 'f':
            return "..-.   ";
         case 'g':
            return "--.   ";
         case 'h':
            return "....   ";  
         case 'i':
            return "..   "; 
         case 'j':
            return ".---   "; 
         case 'k':
            return "-.-   "; 
         case 'l':
            return ".-..   ";
         case 'm':
            return "--   ";
         case 'n':
            return "-.   ";  
         case 'o':
            return "---   "; 
         case 'p':
            return ".--.   "; 
         case 'q':
            return "--.-   "; 
         case 'r':
            return ".-.   ";
         case 's':
            return "...   ";
         case 't':
            return "-   ";  
         case 'u':
            return "..-   "; 
         case 'v':
            return "...-   "; 
         case 'w':
            return ".--   "; 
         case 'x':
            return "-..-   ";
         case 'y':
            return "-.--   ";
         case 'z':
            return "--..   ";  
         case ' ':
            return "    ";                 
      }
      return " ";
   }

   public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        morse m = new morse();
        System.out.print("Enter the string : ");
        String y = sc.nextLine();
        String s = y.toLowerCase();
        int x = s.length();
        for(int i = 0 ; i<x ; i++){
            System.out.print(""+ m.morse_code(s.charAt(i)));
        }
   }
}   
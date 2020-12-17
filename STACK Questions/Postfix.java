import java.util.*;
class Postfix{
   static int top = -1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter expression:  ");
      String exp = sc.next();
      exp = exp + ")";
      String[] array = new String[exp.length()];
      push("(",array);
      expre(exp,array);
   }
   public static void push(String a,String array[]){
      top++;
      array[top] = a;
   }
   public static void pop(String array[]){
      if(top==-1){
         System.out.println("Stack underflow!!!");
      }
      else{
         top--;
      }
   }
   public static void expre(String exp, String[] array){
      String post = "";
      String[] exp1 = exp.split("");
      boolean g = true;
      for(String i : exp1){
         try {  
            Double.parseDouble(i);  
            g = true;
         } catch(NumberFormatException e){  
            g = false;  
         }
         if(g){
            post = post + i;
         }
         else if(i.equals("(")){
            // if(!array[top].equals("(")){
//                String k = array[top];
//                pop(array);
//                while(!array[top].equals("(")){
//                   post = post + array[top];
//                   pop(array);
//                }
//                push(k,array);
//             }
            push(i,array);
         }
         else if(i.equals(")") && g == false){
            while(!array[top].equals("(")){
               post = post + array[top];
               pop(array);
            }
            pop(array);
         }
         else if(!(i.equals(")")) && g==false){
            if((i.equals("+") || i.equals("-"))){
               if(array[top].equals("(")) push(i,array);
               else if(top != -1){
                  while(!array[top].equals("(")){
                     post = post + array[top];
                     pop(array);
                  }
                  push(i,array);
               }
            }
            
            else if((i.equals("*") || i.equals("/")) && top != -1){
               if((array[top].equals("*") || array[top].equals("/") || array[top].equals("^"))){
                  if(top != -1 && array[top] != "("){
                     while(!array[top].equals("(") && !array[top].equals("^")){
                        post = post + array[top];
                        pop(array);
                     }
                     push(i,array);
                  }
                  else push(i,array);
               }
               else{
                  push(i,array);
               }
            }
            else{
               push(i,array);
            }
         }
      }
      System.out.println(post);
      evaluate(post,array);
   }
   public static void evaluate(String post, String[] array){
      String[] str1 = post.split("");
      for(int i = 0; i<str1.length;i++){
         boolean g = true;
         try {  
            Double.parseDouble(str1[i]);  
            g = true;
         } catch(NumberFormatException e){  
            g = false;  
         }
         if(g){
            push(str1[i],array);
         }
         else{
            if(str1[i].equals("*")){
               String b = array[top];
               pop(array);
               String a = array[top];
               pop(array);
               String c =Double.toString(Double.parseDouble(a)*Double.parseDouble(b));
               push(c,array);
            }
            else if(str1[i].equals("/")){
               String b = array[top];
               pop(array);
               String a = array[top];
               pop(array);
               String c =Double.toString(Double.parseDouble(a)/Double.parseDouble(b));
               push(c,array);
            }
            else if(str1[i].equals("+")){
               String b = array[top];
               pop(array);
               String a = array[top];
               pop(array);
               String c =Double.toString(Double.parseDouble(a)+Double.parseDouble(b));
               push(c,array);
            }
            else if(str1[i].equals("-")){
               String b = array[top];
               pop(array);
               String a = array[top];
               pop(array);
               String c =Double.toString(Double.parseDouble(a)-Double.parseDouble(b));
               push(c,array);
            }
            else if(str1[i].equals("^")){
               String b = array[top];
               pop(array);
               String a = array[top];
               pop(array);
               double l = 1;
               for(int j = 0;j<Integer.parseInt(b);j++){
                  l = l*Integer.parseInt(a);
               }
               String c =Double.toString(l);
               push(c,array);
            }
         }
      }
      System.out.println(array[top]);
   }
}
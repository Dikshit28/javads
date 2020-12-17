import java.util.*;
public class Stack_SetC_Q2{
   static int top1=-1;
   static int top2=-1;
   static int top3=-1;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the size of STACK 1 :");
      int size1 = sc.nextInt();
      System.out.print("\nEnter the size of STACK 2 :");
      int size2 = sc.nextInt();
      System.out.print("\nEnter the size of STACK 3 :");
      int size3 = sc.nextInt();
      int[] s1 = new int[size1];
      int[] s2 = new int[size2];
      int[] s3 = new int[size3];
      int sum1=0,sum2=0,sum3=0;
      for(int i = 0; i<size1; i++){
         System.out.print("\nEnter the STACK 1 element "+(i+1)+" :");
         s1[i]= sc.nextInt();
         sum1=sum1+s1[i];
         push1(s1[i],size1,s1);
         
      }
      
      for(int i = 0; i<size2; i++){
         System.out.print("\nEnter the STACK 2 element "+(i+1)+" :");
         s2[i]= sc.nextInt();
         sum2=sum2+s2[i];
         push2(s2[i],size2,s2);
         
      }
      
      for(int i = 0; i<size3; i++){
         System.out.print("\nEnter the STACK 3 element "+(i+1)+" :");
         s3[i]= sc.nextInt();
         sum3=sum3+s3[i];
         push3(s3[i],size3,s3);
         
      }
      while(true){
      if(sum1==sum2 && sum2==sum3){
         System.out.print("Maximum sum is : "+sum1);
      }
      else{
         if(sum1>=sum2 && sum1>=sum3){
            while(true){
               sum1=sum1-s1[top1];
               if(top1>=0)
                  pop1(s1);
               if(sum1<=sum2 && sum1<=sum3){
                  break;
               }
            }
         }
         else if(sum2>=sum1 && sum2>=sum3){
            while(true){
               sum2=sum2-s2[top2];
               if(top2>=0)
                  pop2(s2);
               if(sum2<=sum1 && sum2<=sum3){
                  break;
               }
            }
         }
         else if(sum3>=sum1 && sum3>=sum2){
            while(true){
               sum3=sum3-s3[top3];
               if(top3>=0)
                  pop3(s3);
               if(sum3<=sum1 && sum3<=sum2){
                  break;
               }
            }
         }
         }
         if(sum1==sum2 && sum2==sum3){
            System.out.print("Maximum sum is : "+sum1);
            break;
         }
         }
         
         
      }
      
      
     /* print1(s1);
      print2(s2);
      print3(s3);
      */
    
      
      public static void push1(int e,int size,int[] array){
         top1=top1+1;
         if(top1<=size-1){ 
            array[top1] = e;
         }
         else
         System.out.print("STACK OVERFLOW");
      }
      
      public static void push2(int e,int size,int[] array){
         top2=top2+1;
         if(top2<=size-1){ 
            array[top2] = e;
         }
         else
         System.out.print("STACK OVERFLOW");
      }
      
      public static void push3(int e,int size,int[] array){
         top3=top3+1;
         if(top3<=size-1){ 
            array[top3] = e;
         }
         else
         System.out.print("STACK OVERFLOW");
      }
      
      public static void pop1(int[] array){
         if(top1>0){
           array[top1]=0;
           top1=top1-1; 
         }
         else if(top1==0){
            array[top1]=0;
            top1=-1;
         }
         else
            System.out.print("STACK UNDERFLOW");
      }
      
      public static void pop2(int[] array){
         if(top2>0){
           array[top2]=0;
           top2=top2-1; 
         }
         else if(top2==0){
            array[top2]=0;
            top2=-1;
         }
         else
            System.out.print("STACK UNDERFLOW");
      }
      
      public static void pop3(int[] array){
         if(top3>0){
           array[top3]=0;
           top3=top3-1; 
         }
         else if(top3==0){
            array[top3]=0;
            top3=-1;
         }
         else
            System.out.print("STACK UNDERFLOW");
      }
      
      public static void print1(int[] array){
         System.out.println("\nSTACK 1");
         if(top1!=-1){
            for(int i =0; i<=top1; i++){
               System.out.println(array[i]);
            }
         } 
         if(top1==-1){
            System.out.print("\nStack is Empty");
         }  
      }
      
      public static void print2(int[] array){
         System.out.println("\nSTACK 2");
         if(top2!=-1){
            for(int i =0; i<=top2; i++){
               System.out.println(array[i]);
            }
         } 
         if(top2==-1){
            System.out.print("\nStack is Empty");
         }  
      }
      
      public static void print3(int[] array){
         System.out.println("\nSTACK 3");
         if(top3!=-1){
            for(int i =0; i<=top3; i++){
               System.out.println(array[i]);
            }
         } 
         if(top3==-1){
            System.out.print("\nStack is Empty");
         }  
      }
      
      }
   
   

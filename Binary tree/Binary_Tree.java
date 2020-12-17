import java.util.*;
class Node{
   Node left;
   Node right;
   int data;
   Node(){
      this.data = 0;
      this.left = null;
      this.right = null;
   }
}

public class Binary_Tree{
static Node r;
static int root;
static int c=0;
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      r = new Node();
      r.data = 10;
      root = r.data;
      while(true){
         System.out.print("\nPress 1 to add elements in Binary Search Tree");
         System.out.print("\nPress 2 to display Pre Order of Binary Search Tree");
         System.out.print("\nPress 3 to display Post Order of Binary Search Tree");
         System.out.print("\nPress 4 to display In Order of Binary Search Tree");
         System.out.print("\nPress 5 to delete element of Binary Search Tree");
         System.out.print("\nPress 6 to exit");
         System.out.print("\nEnter choice :");
         int choice = sc.nextInt();
         sc.nextLine();
         if(choice==1){
            System.out.print("\nEnter the numbers separated by space :");
            String numbers = sc.nextLine();
            String n[] = numbers.split("\\s+");
            int[] num = new int[n.length];
            for(int i = 0 ; i<n.length; i++){
               String temp = n[i];
               num[i] = Integer.parseInt(temp);
               r=insertBst(r,num[i]);
            }
         }   
         else if(choice==2){
            System.out.print("\n");
            preorder(r);
         }
         else if(choice==4){
            System.out.print("\n");
            inorder(r);
         } 
         else if(choice==3){  
            System.out.print("\n");
            postorder(r);
         }
         else if(choice==5){
            System.out.print("\nEnter the node to be deleted :");
            int e = sc.nextInt();
            delete(r,e);
         }
         else if(choice==6){
            System.exit(0);
         }               
         
         else{
            System.out.print("Invalid input!Enter again");
         }
         
         
      }
   }
   
   public static void preorder(Node r1){
     // System.out.print(" ");
      if(r1!=null){
         System.out.print(" "+r1.data);
         preorder(r1.left);
         preorder(r1.right);
      }
   }
   
   public static void postorder(Node r1){
    //  System.out.print(" ");
      if(r1!=null){
         postorder(r1.left);
         postorder(r1.right);
         System.out.print(" "+r1.data);
      }
   }
     
   public static void inorder(Node r1){
    //  System.out.print(" ");
      if(r1!=null){
         inorder(r1.left);
         System.out.print(" "+r1.data);
         inorder(r1.right);
      }
   }
   
   public static Node insertBst(Node r,int e){
      if(r==null){
         Node n = new Node();
         n.data = e;
         n.left = null;
         n.right = null;
         r = n;
      
         
      }
      else if(e<=r.data){
         r.left = insertBst(r.left,e);

         
      }
      else{
        r.right = insertBst(r.right,e);
      }
      return r;
      
   }
   
   public static Node find_min(Node temp){
      if(temp.left!=null){
         return find_min(temp.left);
      }
      else{
         return temp;
      }
      
   }
   
   public static void delete(Node temp, int e){
      Node n = new Node();
      
      if(c!=0 && temp.left!=null && temp.left.data==e){
         if(temp.right!=null){
            delete(temp.left,e);
         }
         else{
            temp.left=null;
         }   
      }
      else if(temp.left!=null && temp.left.data==e && temp.left.left==null && temp.left.right==null){
         temp.left=null;
      }
      else if(temp.right!=null && temp.right.data==e && temp.right.left==null && temp.right.right==null){
         temp.right=null;
      }

      else {
         
         if(temp==null){
            System.out.print("\nElement not found");
         }
         else if(e<temp.data){
            delete(temp.left,e);
         }
         else if(e>temp.data){
            delete(temp.right,e);
         }
         else if(temp.left!=null && temp.right!=null){
            n = find_min(temp.right);
            System.out.print("The deleted node is :"+temp.data);
            temp.data = n.data;
            if(temp.data==temp.right.data && temp.right.left==null && temp.right.right==null){
              
                  temp.right=null;
               
            }
            if(temp.right!=null){
               c=c+1;
               delete(temp.right,temp.data);
            }   
         }
         else { 
            if(temp.left!=null && temp.right==null){
               temp.data=temp.left.data;
               temp.right = temp.left.right;
               temp.left = temp.left.left;
            }
            else if(temp.right!=null && temp.left==null){
               temp.data=temp.right.data;
               temp.left = temp.right.left;
               temp.right = temp.right.right;
            }
            else if(temp.left!=null){
               temp.data = temp.left.data;
               temp.left = null;
            }
            else{
               temp.data = temp.right.data;
               temp.right = null;
            }
            
         }   
      }
      
   }
      
   
}
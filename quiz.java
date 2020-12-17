import java.util.*;
public class quiz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the numbers separated by space :");
            String numbers = sc.nextLine();
            String n[] = numbers.split("\\s+");
            int[] num = new int[n.length];
            for(int i = 0; i<n.length; i++){
               System.out.print(n[i]+" ");
            }
            int x = Integer.parseInt(n[4]);
            System.out.print("\n"+(x+100));

    }
}
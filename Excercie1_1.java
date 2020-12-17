import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       if(radius>0){	   
	perimeter = 2*Math.PI*radius;
    area = Math.PI*radius*radius;
    System.out.print(perimeter);
    System.out.print("area");
}
else
  System.out.print("Please enter non zero positive number ");
  }
  }
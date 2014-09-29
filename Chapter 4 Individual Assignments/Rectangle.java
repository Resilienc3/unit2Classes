import java.util.Scanner;
public class Rectangle
{
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print("What is the length: ");
       double l = s.nextDouble();
       System.out.print("What is the width: ");
       double w = s.nextDouble();
       double a;
       double p;
       double d;
       a = l*w;
       p = (2*l) + (2*w);
       d = Math.sqrt(Math.pow(l,2) + Math.pow(w,2));
       System.out.println("The area is: " + a);
       System.out.println("The perimeter is: " + p);
       System.out.println("The length of the diagonal is: " + d);
   }
}
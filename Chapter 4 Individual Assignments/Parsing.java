import java.util.Scanner;
public class Parsing
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String num = s.next();
        int length = num.length();
        String pt1 = num.substring(0,length-4);
        String pt2 = num.substring(length-3);
        String p1_p2 = pt1 + pt2;
        //int finalnum = (int) p1_p2;
        System.out.println(p1_p2);
        
        
        
    }
}
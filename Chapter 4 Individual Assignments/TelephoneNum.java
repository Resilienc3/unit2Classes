import java.util.Scanner;

public class TelephoneNum
{
    public static void main (String[] args)
    {
        String num = "4155551212";
        String sub1 = num.substring(0,3);
        String sub2 = num.substring(3,6);
        String sub3 = num.substring(6);
        String finalNum = "(" + sub1 + ") " + sub2+ "-" + sub3;
        System.out.println(finalNum);
        
    }
}
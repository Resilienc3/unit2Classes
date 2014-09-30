import java.util.Scanner;

public class CashRegister
{
    public static void main (String[] args)
    {
        // Scanned owed and received
        int amountOwed= 1000;
        int amountPaid = 2000;
        int changeDue = amountPaid - amountOwed;
        final int QUARTER_V = 25;
        final int DIME_V = 10;
        final int NICKEL_V = 5;
        int qNum = 0;
        int dNum = 0;
        int nNum = 0;
        int pNum = 0;
        int numC = changeDue;
        qNum = numC/QUARTER_V;
        numC = changeDue - (numC/QUARTER_V);
        int mod = numC%QUARTER_V;
        dNum = mod/DIME_V;
        numC = numC - (numC/DIME_V);
        mod = numC%DIME_V;
        nNum = mod/NICKEL_V;
        numC = numC - (numC/NICKEL_V);
        mod = numC%NICKEL_V;
        pNum = mod; 
        
        System.out.println("Quarters: " + qNum +" Dimes: " + dNum +" Nickels: "+ nNum +" Pennies: " + pNum);
    }
}
// Divide by quarters, mod by quarters, while mod != 0 divide by dimes, mod by dimes, etc.
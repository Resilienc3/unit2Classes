

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAddToken()
    { 
        VendingMachine testVM = new VendingMachine();
        testVM.addToken();
        int token = testVM.getTokenCount();
        assertEquals(1, token);
    }
    
    @Test 
    public void testFillUp()
    {
        VendingMachine testVM = new VendingMachine();
        testVM.fillUp(10);
        int cans = testVM.getCanCount();
        assertEquals(10, cans);
        
    }
    
    @Test 
    public void testGetCanCount()
    {
        VendingMachine testVM = new VendingMachine();
        int cans = testVM.getCanCount();
        assertEquals(0, cans);
    }
    
    @Test
    public void testGetTokenCount()
    {
        VendingMachine testVM = new VendingMachine();
        int tokens = testVM.getTokenCount();
        assertEquals(0, tokens);
    }
   
}

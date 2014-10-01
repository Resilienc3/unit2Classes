import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Constructs a building object with windows
 * 
 * @author Jalen Smith
 * @version 10/1/14
 */
public class Building
{
    /** private variable x = x-coordinate*/
    private int x;
    /** private variable y = y-cooridinate*/
    private int y;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x ,int y)
    {
        // initialise instance variables
        int xCo = this.x;
        int yCo = this.y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}

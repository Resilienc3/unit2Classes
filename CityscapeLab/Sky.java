import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Constructs a building object with windows
 * 
 * @author Jalen Smith
 * @version 10/1/14
 */
public class Sky
{
    /** private variable for the Red color*/
    private int comp1;
    /** private variable for the Green color*/
    private int comp2;
    /** private variable for the Blue color*/
    private int comp3;

    /**
     * Default constructor for objects of class Building
     */
    public Sky(int red, int green, int blue)
    {
        // initialise instance variables
        comp1 = red;
        comp2 = green;
        comp3 = blue;
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
    public void draw(Graphics2D g2, int w, int h)
    {
        // put your code here
        Rectangle2D.Double sky = new Rectangle2D.Double(0,0,w, h);
        
        Color hue = new Color(comp1, comp2, comp3);
        g2.setColor(hue);
        g2.fill(sky);
        
    }

}

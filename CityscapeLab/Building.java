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
public class Building
{
    /** private variable x = x-coordinate*/
    private int xCo;
    /** private variable y = y-cooridinate*/
    private int yCo;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x ,int y)
    {
        // initialise instance variables
        xCo = x;
        yCo = y;
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
    public void draw(Graphics2D g2, int w, int h, int comp1, int comp2, int comp3)
    {
        // put your code here
        Rectangle2D.Double struct = new Rectangle2D.Double(this.xCo, this.yCo, w, h);
        
        Color hue = new Color(comp1, comp2, comp3);
        g2.setColor(hue);
        g2.fill(struct);
        
    }

}

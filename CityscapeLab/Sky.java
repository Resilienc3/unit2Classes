import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Constructs a Sky
 * 
 * @author Jalen Smith
 * @version 10/6/14
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
     * Default constructor for objects of class Sky
     */
    public Sky(int red, int green, int blue)
    {
        
        comp1 = red;
        comp2 = green;
        comp3 = blue;
    }

    /**
     * Draw - Configures and creates the sky
     * @pre       All paramaters must be ints
     * @param    w      width of the sky
     * @param    h      height of the sky
     */
    public void draw(Graphics2D g2, int w, int h)
    {
        
        Rectangle2D.Double sky = new Rectangle2D.Double(0,0,w, h);
        
        Color hue = new Color(comp1, comp2, comp3);
        g2.setColor(hue);
        g2.fill(sky);
        
    }

}

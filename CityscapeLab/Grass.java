import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Constructs a field of grass
 * @author Jalen Smith
 * @version 10/6/14
 */
public class Grass
{
    /** private variable for the Red color*/
    private int comp1;
    /** private variable for the Green color*/
    private int comp2;
    /** private variable for the Blue color*/
    private int comp3;

    /**
     * Default constructor for objects of class Grass
     */
    public Grass(int red, int green, int blue)
    {
        comp1 = red;
        comp2 = green;
        comp3 = blue;
    }

    /**
     * Draw - Configures and creates the grass (maintains and cuts itself)
     * @pre       width and height must be ints
     * @param     w     width of the grass
     * @param     h     height of the grass
     */
    public void draw(Graphics2D g2, int w, int h)
    {
        
        Rectangle2D.Double grass = new Rectangle2D.Double(0,200,w, h);
        
        Color hue = new Color(comp1, comp2, comp3);
        g2.setColor(hue);
        g2.fill(grass);
        
    }

}

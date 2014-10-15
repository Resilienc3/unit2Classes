import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Constructs a building object
 * 
 * @author Jalen Smith
 * @version 10/6/14
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
        
        xCo = x;
        yCo = y;
    }

    /**
     * Draw method that creates and configures the building
     * @pre        all numbers must be in int form
     * @param    w    width of building as an int
     * @param    h    height as an int
     * @param    comp1,comp2,comp3,   The Red, Green, and Blue components of the color respectively
     */
    public void draw(Graphics2D g2, int w, int h, int comp1, int comp2, int comp3)
    {
        Rectangle2D.Double struct = new Rectangle2D.Double(this.xCo, this.yCo, w, h);
        Rectangle2D.Double window1 = new Rectangle2D.Double(this.xCo + w/16, this.yCo + 10, w/4, h/4);
        Rectangle2D.Double window2 = new Rectangle2D.Double(this.xCo + w/2, this.yCo + 10, w/4, h/4);
        Rectangle2D.Double window3 = new Rectangle2D.Double(this.xCo + w/16, this.yCo + h/2, w/4, h/4);
        Rectangle2D.Double window4 = new Rectangle2D.Double(this.xCo + w/2, this.yCo + h/2, w/4, h/4);
        Color hue = new Color(comp1, comp2, comp3);
        g2.setColor(hue);
        g2.fill(struct);
        g2.setColor(Color.YELLOW);
        g2.fill(window1);
        g2.fill(window2);
        g2.fill(window3);
        g2.fill(window4);
        
        
    }

}

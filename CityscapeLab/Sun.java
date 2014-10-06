import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Constructs a Sun object
 * 
 * @author Jalen Smith
 * @version 10/6/14
 */
public class Sun
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;

    /**
     * Constructor for objects of class Sun
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draw - Constructs a sun that sits in the top left corner of the screen
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft , yTop, 75, 75);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        
    }
}

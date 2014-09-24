import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;

    /**
     * Constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double fifth = new Ellipse2D.Double(xLeft + 120, yTop + 150, 30, 30);
        Ellipse2D.Double fourth = new Ellipse2D.Double(xLeft + 110, yTop + 140, 50, 50);
        Ellipse2D.Double third = new Ellipse2D.Double(xLeft + 100, yTop + 130, 70, 70);
        Ellipse2D.Double second = new Ellipse2D.Double(xLeft + 90, yTop + 120, 90, 90);
        Ellipse2D.Double first = new Ellipse2D.Double(xLeft + 80, yTop + 110, 110, 110);
        
        g2.draw(first);
        g2.setColor(Color.BLACK);
        g2.fill(first);
        g2.draw(second);
        g2.setColor(Color.WHITE);
        g2.fill(second);
        g2.draw(third);
        g2.setColor(Color.BLACK);
        g2.fill(third);
        g2.draw(fourth);
        g2.setColor(Color.WHITE);
        g2.fill(fourth);
        g2.draw(fifth);
        g2.setColor(Color.BLACK);
        g2.fill(fifth);
    }
}

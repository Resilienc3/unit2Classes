import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // create instances of classes and invoke the draw method on each
        // ...
        Building building1 = new Building(255,150);
        Building building2 = new Building(450,150);
        Sky sky = new Sky(0,100,200);
        Grass grass = new Grass(0,255,0);
        Sun sun = new Sun(0,0);
        int x = getWidth()-60;
        int y = getHeight() -30;
        sky.draw(g2, 2560, 1360);
        grass.draw(g2, 2560, 1360);
        building1.draw(g2, 150, 200, 0, 0, 0);
        building2.draw(g2,150, 200,255,0,0);
        sun.draw(g2);
        
        
        
    }

}

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.Random;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit @Jalen Smith
 * @version 7 October 2014
 */
public class CityscapeComponent extends JComponent
{
    private int numOfBuildings;
    
    /**
     * Default constructor for objects of the Component Class
     */
    public CityscapeComponent(int x)
    {
        // initialise instance variables
        numOfBuildings = x;
        
    }
    
    /**
     * paintComponent 
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Random r = new Random();
        int xPos = 255;
        Sky sky = new Sky(0,100,200);
        Grass grass = new Grass(0,255,0);
        Sun sun = new Sun(0,0);
        sky.draw(g2, 2560, 1360);
        grass.draw(g2, 2560, 1360);
        sun.draw(g2);
        
          for (int x = 0; x < this.numOfBuildings ; x=x+1)
        {
            Building building = new Building(xPos,150);
            building.draw(g2, 150, 200, r.nextInt(256),r.nextInt(256),r.nextInt(256));
            xPos += 200;
        }
        
    }

}

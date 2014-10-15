import javax.swing.JFrame;
import java.util.Scanner;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit @Jalen Smith
 * @version 7 October 2014
 */
public class CityscapeViewer
{
    /**
     * main method for the program which creates and configures the frame for the program as well as prompt for number of buildings
     *
     */
    public static void main(String[] args)
    {
        
        JFrame frame = new JFrame();
        
        frame.setSize(2560, 1256);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        System.out.print("How many buildings would you like (ints only): ");
        Scanner s = new Scanner(System.in);
        
        CityscapeComponent component = new CityscapeComponent(s.nextInt());
        frame.add(component);
        
        
        frame.setVisible(true);
    }

}

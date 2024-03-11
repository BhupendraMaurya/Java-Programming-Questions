import java.applet.Applet;
import java.awt.Graphics;
 
// HelloWorld class extends Applet
public class Applet1 extends Applet
{
    // Overriding paint() method
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Hello World", 20, 20);
    }
     
}
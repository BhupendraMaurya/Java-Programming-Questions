import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ExampleApplet extends Applet {
    public void init() {
        JFrame frame = new JFrame("Example Applet");
        frame.add(this);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Hello, Java Applet!", 20, 20);
    }

    public static void main(String[] args) {
        ExampleApplet applet = new ExampleApplet();
        applet.init();
    }
}

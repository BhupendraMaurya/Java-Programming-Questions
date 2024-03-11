import javax.swing.*;
public class JavaSwing extends JFrame{

    public JFrame j;
    public JavaSwing(){
        j = new JFrame();
        j.setTitle("Hello worle:");

        JButton button = new JButton("click me");
        button.setBounds(40, 30, 100, 30);
        j.add(button);

        JLabel label = new JLabel("Java si=wing tuto");
        label.setBounds(40, 70, 250, 30);
        j.add(label);

        JTextField field =new JTextField();
        field.setBounds(100, 200, 250, 40);
        j.add(field);
        j.setLayout(null);
        j.setSize(400, 420);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        new JavaSwing();
        // JavaSwing js = new JavaSwing();
        // js.setTitle("Helllo bhupenda");
        // //js.setLayout(null);
        // js.setSize(400, 300);
        // js.setVisible(true);
        
        
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hellomodify {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        g.setColor(Color.red);
        g.drawLine(100,100, 500, 500);
        g.drawRect(400, 100, 300, 300);
        g.drawOval(420, 120, 260, 260);
        g.fillRect(700, 450, 400, 400);
        g.setColor(Color.black);
        g.fillOval(720, 470, 360, 360);
    }
}
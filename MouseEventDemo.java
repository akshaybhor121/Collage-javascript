import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    String message = "Perform Mouse Action";

    MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(500, 300);
        setVisible(true);

        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(message, 100, 150);
    }

    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited";
        repaint();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
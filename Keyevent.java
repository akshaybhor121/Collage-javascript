import java.awt.*;
import java.awt.event.*;

public class Keyevent extends Frame implements KeyListener {

    Label l;

    Keyevent() 
    {

        l = new Label();
        l.setBounds(50, 100, 300, 30);

        add(l);

        addKeyListener(this);

        setSize(400, 300);
        setLayout(null);
        setTitle("Keyboard Event Demo");
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new Keyevent();
    }
}
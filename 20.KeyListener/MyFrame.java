import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{
    
    JLabel label;

    MyFrame() {
        this.setTitle("Key Listener");
        this.setSize(500, 5000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);

        this.setVisible(true);
    }

    // This method is called when a key is pressed down.
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
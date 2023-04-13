import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("My First frame"); //sets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes sure program exits when frame closes
        this.setResizable(true); //prevents frame from being resized (false)
        // Kalau pake pack() gaperlu setSize()
        // this.setSize(1000,1000); //sets the x-dimension, and y-dimension of the frame
        this.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("/plumbob.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0,66,37)); //change color of background
    }
}

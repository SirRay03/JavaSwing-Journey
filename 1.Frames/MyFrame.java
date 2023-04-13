import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("My First frame"); //sets title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes sure program exits when frame closes
        this.setResizable(false); //prevents frame from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of the frame
        this.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("/plumbob.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0,66,37)); //change color of background
    }
}

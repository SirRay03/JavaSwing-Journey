// import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;


public class Main {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to
        /*
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("My First Frame"); //sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes sure program exits when frame closes
        frame.setResizable(false); //prevents frame from being resized
        frame.setSize(420,420); //sets the x-dimension, and y-dimension of the frame
        frame.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("/plumbob.png"); //create an image icon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(0,66,37)); //change color of background
        */
        
        MyFrame myFrame = new MyFrame();

        // CHAPTER 2 : LABELS

        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon java = new ImageIcon("java.png"); //create an image icon

        JLabel label = new JLabel(); // creates a label
        label.setText("Hello World!"); //sets text of label
        label.setIcon(java); //sets image of label
        label.setHorizontalTextPosition(JLabel.CENTER); //sets text LEFT, CENTER, or RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); //sets text TOP, CENTER, or BOTTOM of image icon

        myFrame.add(label); //adds label to frame
        label.setForeground(new Color(255,255,255)); //sets the text color of the label
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); //sets the font of the label
        // label.setIconTextGap(-10); //sets the gap between the text and the image icon

        
        // SEMUA DAERAH JADI BACKGROUNG (Pake Layout Manager)
        label.setBackground(Color.black); //sets the background color of the label
        label.setOpaque(true); //display label background
        
    
        label.setBorder(BorderFactory.createLineBorder(Color.green) ); //creates a border around the label
        label.setVerticalAlignment(JLabel.CENTER); //sets vertical position of the label
        label.setHorizontalAlignment(JLabel.CENTER); //sets horizontal position of the label

        // myFrame.setLayout(null); //sets the layout manager
        // Label harus diatur manual posisinya
        // label.setBounds(125,125,750,750); //sets the x and y position, as well as the width and height
        
        // Pakai frame.pack() untuk mengatur posisi, ukuran label and ukuran frame secara otomatis
        myFrame.pack();
    }
}
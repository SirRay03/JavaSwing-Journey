// import javax.swing.JFrame;
// import javax.swing.ImageIcon;
import javax.swing.JLabel;
// import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.Color;
// import java.awt.Font;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {

        // CHAPTER 3 : PANELS
        // JPanel = a GUI component that functions as a container to hold other components

        MyFrame myFrame = new MyFrame();

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.black);
        panel1.setBounds(250,300,500,100);
        panel1.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.setBounds(250,400,500,100);
        panel2.setLayout(new BorderLayout());

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        panel3.setBounds(250,500,500,100);
        panel3.setLayout(new BorderLayout());

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.white);
        panel4.setBounds(250,100,500,100);
        panel4.setLayout(new BorderLayout());

        JLabel label = new JLabel();
        label.setText("Willkomen!");
        label.setHorizontalAlignment(JLabel.CENTER);

        panel4.add(label);

        myFrame.add(panel1);
        myFrame.add(panel2);
        myFrame.add(panel3);
        myFrame.add(panel4);
    }
}
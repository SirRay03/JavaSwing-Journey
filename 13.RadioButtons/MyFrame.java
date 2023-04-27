import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        radioButton1 = new JRadioButton("Pizza");
        radioButton2 = new JRadioButton("Hamburger");
        radioButton3 = new JRadioButton("Hotdog");

        // ButtonGroup groups radio buttons together so that only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button){
            if (radioButton1.isSelected()){
                System.out.println("You ordered pizza!");
            }
            if (radioButton2.isSelected()){
                System.out.println("You ordered a hamburger!");
            }
            if (radioButton3.isSelected()){
                System.out.println("You ordered a hotdog!");
            }
        }
    }
}

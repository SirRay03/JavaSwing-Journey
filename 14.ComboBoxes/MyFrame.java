import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JComboBox comboBox;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        String[] animals = {"dog", "cat", "bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();
        
        this.add(comboBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}

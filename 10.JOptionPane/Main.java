import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        // JOptionPane =pop up a standard dialog box that prompts 
        //              users for a value or informs them of something

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "This is some useless info 2", "title", JOptionPane.INFORMATION_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "REALLY?", "title", JOptionPane.QUESTION_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "YOUR COMPUTER HAS A VIRUS?!?!?!", "title", JOptionPane.WARNING_MESSAGE);
        
        //JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "BRO, DO YOU EVEN CODE?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

        System.out.println(answer); // 0=yes, 1=no, 2=cancel, -1=x

        String name = JOptionPane.showInputDialog("What is your name?: ");

        System.out.println("Hello " + name);

        JOptionPane.showOptionDialog(null, "You are awesome", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
    }
}

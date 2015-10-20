import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Program {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		int messageReturn = 0;
		
		//firstName = JOptionPane.showInputDialog("Enter your first name: ");
		//lastName =  JOptionPane.showInputDialog("Enter your last name: ");
		
		//JOptionPane.showMessageDialog(null, "First Name: " + firstName +  "\n" + "Last Name: " +
		//lastName, "Profile info", JOptionPane.PLAIN_MESSAGE);
		//messageReturn = JOptionPane.showConfirmDialog(null, "Error - Incorrect Input", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
		//System.out.println(messageReturn);
		
		MyDialogue myDialog = new MyDialogue();
		myDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		myDialog.setVisible(true);
	}

}

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyDialogue extends JDialog {

	private final JPanel _contentPanel = new JPanel();


	/**
	 * Create the dialog.
	 */
	//CONSTRUCTOR*****************************
	public MyDialogue(){
		this._initialize();
	}
	
	private void _initialize() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		this._contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(this._contentPanel, BorderLayout.CENTER);
		_contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			_contentPanel.add(panel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}

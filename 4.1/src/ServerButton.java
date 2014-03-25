/**
 * @author: Asfandyar Ashraf Malik
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerButton implements ActionListener {
	private JTextField field;
	private JTextArea disp;
	private boolean respond;
	
	public ServerButton(JTextField field, JTextArea disp) {
		this.field = field;
		this.disp = disp;
		respond = true;
	}
	
	public void actionPerformed(ActionEvent event) {
		Object obj = event.getSource();
		if (obj instanceof JButton) {
			if (respond) {
				String path = field.getText();
				File collectionFile = new File(path);
				if(collectionFile.isDirectory()!= true){
					disp.append("Error");
					disp.append("Error");
				} else {
					disp.append("File exists! \n");
					disp.append("Server running!\n");
					respond = false;
				}
			}
		}
	}

}

/**
 * @author: Asfandyar Ashraf Malik
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientButton implements ActionListener {
	private JTextField field;
	private JTextArea disp;
	private Socket socket;
	private boolean respond;
	
	public ClientButton(JTextField field, JTextArea disp, Socket socket) {
		this.field = field;
		this.disp = disp;
		respond = true;
		this.socket = socket;
	}
	
	public void actionPerformed(ActionEvent event) {
		Object obj = event.getSource();
		if (obj instanceof JButton) {
			if (respond) {
				respond = false;
				new FileClient(disp, field.getText(), socket);
			}
		}
	}
}
	

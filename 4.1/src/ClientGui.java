/**
 * @author: Asfandyar Ashraf Malik
 */


import java.awt.BorderLayout;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGui {
	public static void main(String[] args) {
		JFrame aFrame = new JFrame("Client");
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aFrame.setSize(500,250);
		aFrame.setVisible(true);
		aFrame.setResizable(false);
		
		JTextArea disp = new JTextArea(10, 40);
		disp.setEditable(false);
		aFrame.add(disp, BorderLayout.NORTH);
		
		JPanel aPanel = new JPanel();
		JTextField input = new JTextField(30);
		aPanel.add(input, BorderLayout.WEST);
		
		JButton button = new JButton("Enter");
		aPanel.add(button, BorderLayout.EAST);
		
		JScrollPane scroll = new JScrollPane (disp, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		aFrame.add(scroll);
		aFrame.add(aPanel, BorderLayout.SOUTH);
		aFrame.validate();
		
		InetAddress addr = null;
		try {
			addr = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Socket socket = null;
		try {
			socket = new Socket(addr, FileClient.PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		disp.append("socket = " + socket + "\n");
		
		ClientButton handler = new ClientButton(input, disp, socket);
		button.addActionListener(handler);
		disp.append("Enter Qwuery:\n");
		
	}
}

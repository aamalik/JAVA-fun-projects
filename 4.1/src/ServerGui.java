/**
 * @author: Asfandyar Ashraf Malik
 */


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGui {
	public static void main(String[] args) {
		JFrame aFrame = new JFrame("MutiThreaded File Server");
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aFrame.setSize(500,250);
		aFrame.setVisible(true);
		aFrame.setResizable(false);
		
		JTextArea disp = new JTextArea(10,40);
		disp.setEditable(false);
		aFrame.add(disp, BorderLayout.NORTH);
		
		JPanel aPanel = new JPanel();
		JTextField input = new JTextField(30);
		aPanel.add(input, BorderLayout.WEST);
		
		JButton button = new JButton("Enter");
		ServerButton handler = new ServerButton(input, disp);
		button.addActionListener(handler);
		aPanel.add(button, BorderLayout.EAST);
		
		
		JScrollPane scroll = new JScrollPane (disp, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		aFrame.add(scroll);
		aFrame.add(aPanel, BorderLayout.SOUTH);
		aFrame.validate();
		disp.append("Server Started\n");
		disp.append("Put the path of the desired directory: \n");
	}
}

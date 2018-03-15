package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class AdminPanel {

	
	static void addAdminContent() {
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		JPanel adminPanel = new JPanel();
		adminPanel.setLayout(new FlowLayout());
		adminPanel.setBorder(border);
		Frame.getFrame().add(adminPanel, BorderLayout.CENTER);
		
		JTextArea adminArea = new JTextArea();
		adminPanel.add(adminArea);
		
	}
	
}

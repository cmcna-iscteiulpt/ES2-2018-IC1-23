package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Frame {

private static JFrame frame;

	public static JFrame getFrame() {
		return frame;
	}

	public Frame() {
		
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		UserPanel.addUserContent();
		AdminPanel.addAdminContent();
		ButtonsPanel.addBottonsContent();
		frame.pack();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((dimension.width-frame.getWidth())/2, (dimension.height-frame.getHeight())/2);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Frame();
	}
	
}

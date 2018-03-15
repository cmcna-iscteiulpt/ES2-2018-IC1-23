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

	public Frame(int a, int b) {
		
		frame = new JFrame();
		frame.setSize(a, b);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((dimension.width-a)/2, (dimension.height-b)/2);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		UserPanel.addUserContent();
		AdminPanel.addAdminContent();
		ButtonsPanel.addBottonsContent();
		//frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame(700, 500);
	}
	
}

package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel {

	static void addBottonsContent() {
		
		JPanel bottonsPanel = new JPanel();
		bottonsPanel.setLayout(new GridLayout(0,4));
		Frame.getFrame().add(bottonsPanel, BorderLayout.SOUTH);
		
		JButton problemButton = new JButton("Problemas Anteriores");
		problemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		bottonsPanel.add(problemButton);
		
		JButton executeButton = new JButton("Executar");
		executeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		bottonsPanel.add(executeButton);
		
		JButton helpButton = new JButton("Help");
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		bottonsPanel.add(helpButton);
		
		JButton facButton = new JButton("FAC");
		facButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		bottonsPanel.add(facButton);
	}
	
	
}

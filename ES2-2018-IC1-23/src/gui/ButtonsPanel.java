package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ButtonsPanel {

	private static JFrame buttonsFrame;
	
	static void addBottonsContent() {
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		JPanel bottonsPanel = new JPanel();
		bottonsPanel.setLayout(new GridLayout(0,4));
		bottonsPanel.setBorder(border);
		Frame.getFrame().add(bottonsPanel, BorderLayout.SOUTH);
		
		JButton problemButton = new JButton("Problemas Anteriores");
		problemButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonsFrame(1, 500, 400);
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
				buttonsFrame(2, 500, 200);
			}
		});
		bottonsPanel.add(helpButton);
		
		JButton faqButton = new JButton("FAQ");
		faqButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonsFrame(3, 500, 400);
			}
		});
		bottonsPanel.add(faqButton);
	}
	
	private static void buttonsFrame(int aux,int a, int b) {
		
		buttonsFrame = new JFrame();
		buttonsFrame.setSize(a, b);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		buttonsFrame.setLocation((dimension.width-a)/2, (dimension.height-b)/2);
		switch (aux) {
			case 1:
				addProblemContent();
				break;
			case 2:
				buttonsFrame.setLayout(new BorderLayout());
				addHelpContent();
				break;
			case 3:
				addProblemContent();
				break;
			default:
				break;
		}
		buttonsFrame.setResizable(false);
		buttonsFrame.setVisible(true);
		
	}
	
	private static void addProblemContent() {
		
		JPanel problemPanel = new JPanel();
		problemPanel.setLayout(new GridLayout(0,2));
		buttonsFrame.add(problemPanel);
		
		DefaultListModel<String> model = new DefaultListModel<>();	
		
		JList<String> list = new JList<>(model);
		
		JTextArea textArea = new JTextArea();
		
		JScrollPane scroll = new JScrollPane(list);
		problemPanel.add(scroll);
		
		JScrollPane scroll2 = new JScrollPane(textArea);
		problemPanel.add(scroll2);
		
	}

	private static void addHelpContent() {
		
		JLabel emailLabel = new JLabel("Exponha a(s) sua(s) dúvida(s):");
		buttonsFrame.add(emailLabel, BorderLayout.NORTH);
		
		JTextField emailText = new JTextField("Introduza a sua dúvida");
		buttonsFrame.add(emailText, BorderLayout.CENTER);
		
		JButton sendButton = new JButton("Enviar");
		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonsFrame.add(sendButton, BorderLayout.SOUTH);
		
	}
	
}

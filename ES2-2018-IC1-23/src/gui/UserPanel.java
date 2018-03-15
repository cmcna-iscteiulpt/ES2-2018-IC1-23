package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class UserPanel {

	static void addUserContent() {
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		JPanel clientPanel = new JPanel();
		clientPanel.setLayout(new GridLayout(8,2));
		clientPanel.setBorder(border);
		Frame.getFrame().add(clientPanel, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		clientPanel.add(panel);
		
		JCheckBox check = new JCheckBox("Li e tomei conhecimento");
		clientPanel.add(check);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		clientPanel.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		clientPanel.add(panel3);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		clientPanel.add(panel4);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BorderLayout());
		clientPanel.add(panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(new BorderLayout());
		clientPanel.add(panel6);		
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(new BorderLayout());
		clientPanel.add(panel7);
		
	/*	addLabels();
	}
	
	private static void addLabels() {
	*/	JLabel emailLabel = new JLabel("Email:");
		panel.add(emailLabel, BorderLayout.LINE_START);
		
		JTextField emailText = new JTextField("Introduza o seu email");
		panel.add(emailText);
				
		JLabel nameLabel = new JLabel("Nome:");
		panel2.add(nameLabel, BorderLayout.LINE_START);

		JTextField nameText = new JTextField("Nome do seu problema");
		panel2.add(nameText);
		
		JLabel descriptionLabel = new JLabel("Descrição:");
		panel3.add(descriptionLabel, BorderLayout.LINE_START);
		
		JTextField descriptionText = new JTextField("Descreva o seu problema");
		panel3.add(descriptionText);
		
		JLabel waitLabel = new JLabel("Tempo maximo de espera:");
		panel4.add(waitLabel, BorderLayout.LINE_START);

		JTextField waitText = new JTextField("Introduza o tempo");
		panel4.add(waitText);
		
		JLabel hourLabel = new JLabel("Melhor hora para receber resolução de problema:");
		panel5.add(hourLabel, BorderLayout.LINE_START);

		JTextField hourText = new JTextField("Introduza a hora");
		panel5.add(hourText);
		
		JLabel variablesLabel = new JLabel("Nº variáveis decisão:");
		panel6.add(variablesLabel, BorderLayout.LINE_START);

		JTextField variablesText = new JTextField("Introduza o nº de variáveis");
		panel6.add(variablesText);
		
		JButton okButton= new JButton("Ok");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		panel7.add(okButton, BorderLayout.EAST);
		
	}
	
}

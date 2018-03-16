package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
		clientPanel.setLayout(new GridLayout(9,1));
		clientPanel.setBorder(border);
		Frame.getFrame().add(clientPanel, BorderLayout.WEST);
		
		JPanel emailPanel = new JPanel();
		emailPanel.setLayout(new FlowLayout(0));
		clientPanel.add(emailPanel);
		
		JPanel checkPanel = new JPanel();
		checkPanel.setLayout(new FlowLayout(0));
		clientPanel.add(checkPanel);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout(0));
		clientPanel.add(namePanel);
		
		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setLayout(new FlowLayout(0));
		clientPanel.add(descriptionPanel);
		
		JPanel description2Panel = new JPanel();
		description2Panel.setLayout(new BorderLayout());
		clientPanel.add(description2Panel);
		
		JPanel waitPanel = new JPanel();
		waitPanel.setLayout(new FlowLayout(0));
		clientPanel.add(waitPanel);
		
		JPanel hourPanel = new JPanel();
		hourPanel.setLayout(new FlowLayout(0));
		clientPanel.add(hourPanel);
		
		JPanel variablesPanel = new JPanel();
		variablesPanel.setLayout(new FlowLayout(0));
		clientPanel.add(variablesPanel);		
		
		JPanel okPanel = new JPanel();
		okPanel.setLayout(new BorderLayout());
		clientPanel.add(okPanel);
		
		JLabel emailLabel = new JLabel("E-mail:");
		emailPanel.add(emailLabel);
		
		JTextField emailText = new JTextField("Introduza o seu e-mail");
		emailPanel.add(emailText);
	
		JCheckBox check = new JCheckBox("Li e tomei conhecimento");
		checkPanel.add(check);
				
		JLabel nameLabel = new JLabel("Nome:");
		namePanel.add(nameLabel);

		JTextField nameText = new JTextField("Nome do seu problema");
		namePanel.add(nameText);
		
		JLabel descriptionLabel = new JLabel("Descrição:");
		descriptionPanel.add(descriptionLabel, BorderLayout.LINE_START);
		
		JTextField descriptionText = new JTextField("Descreva o seu problema");
		description2Panel.add(descriptionText);
		
		JLabel waitLabel = new JLabel("Tempo máximo de espera:");
		waitPanel.add(waitLabel);

		JTextField waitText = new JTextField("Introduza o tempo");
		waitPanel.add(waitText);
		
		JLabel hourLabel = new JLabel("Hora que pretende receber a resolução do problema:");
		hourPanel.add(hourLabel);

		JTextField hourText = new JTextField("Introduza a hora");
		hourPanel.add(hourText);
		
		JLabel variablesLabel = new JLabel("Nº variáveis decisão:");
		variablesPanel.add(variablesLabel);

		JTextField variablesText = new JTextField("Introduza o nº de variáveis");
		variablesPanel.add(variablesText);
		
		JButton okButton= new JButton("Ok");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		okPanel.add(okButton, BorderLayout.EAST);
		
	}
	
}

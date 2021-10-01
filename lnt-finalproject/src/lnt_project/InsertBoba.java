package lnt_project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class InsertBoba extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JLabel nameLabel = new JLabel("Nama Boba: ");
	JTextField nameInput = new JTextField();
	
	JLabel priceLabel = new JLabel("Price: ");
	JTextField priceInput = new JTextField();
	
	JLabel stockLabel = new JLabel("Stock: ");
	JTextField stockInput = new JTextField();
	
	JButton submitBtn = new JButton("Submit");
	JButton cancelBtn = new JButton ("Cancel");
	
	
	public InsertBoba() {
		ViewMenu();
	}
	
	private void ViewMenu() {
		setTitle("BobaCool");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocation(450,150);
		setVisible(true);
		
		createMenuTitle();
		createInputs();
	}

	private void createMenuTitle() {
		JLabel menuTitle = new JLabel("BobaCool");
		menuTitle.setFont(new Font("Verdana", Font.PLAIN, 24));
		menuTitle.setHorizontalAlignment(JLabel.CENTER);
		add(menuTitle, BorderLayout.NORTH);
	}
	
	private void createInputs() {
		JPanel insertInput = new JPanel();
		insertInput.setLayout(new BoxLayout(insertInput, BoxLayout.Y_AXIS));
		insertInput.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		insertInput.add(nameLabel);
		insertInput.add(nameInput);
		
		insertInput.add(priceLabel);
		insertInput.add(priceInput);
		
		insertInput.add(stockLabel);
		insertInput.add(stockInput);
		
		insertInput.add(submitBtn);
		insertInput.add(cancelBtn);
	
		cancelBtn.addActionListener(this);
		submitBtn.addActionListener(this);
		
		add(insertInput);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
 
			if(e.getSource().equals(cancelBtn)) {
			new CreateMenu();
			setVisible(false);
		}
		
	}
	

}

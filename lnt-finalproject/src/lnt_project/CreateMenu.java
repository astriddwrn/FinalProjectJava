package lnt_project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

import java.awt.Font;

public class CreateMenu extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JLabel menuTitle = new JLabel("BobaCool");
	JButton insertBtn = new JButton("Insert Menu");
	JButton viewBtn = new JButton("View Menu");
	JButton updateBtn = new JButton("Update Menu");
	JButton deleteBtn = new JButton("Delete Menu");
	
	public CreateMenu() {
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
		setMainMenu();
	}
	
	private void createMenuTitle() {
		JLabel menuTitle = new JLabel("BobaCool");
		menuTitle.setFont(new Font("Verdana", Font.PLAIN, 24));
		menuTitle.setHorizontalAlignment(JLabel.CENTER);
		add(menuTitle, BorderLayout.NORTH);
	}
	
	private void setMainMenu() {
		JPanel MainMenu = new JPanel();
		MainMenu.setLayout(new BoxLayout(MainMenu, BoxLayout.Y_AXIS));
		MainMenu.setBorder(BorderFactory.createEmptyBorder(50, 10, 10, 10));
		MainMenu.add(Box.createHorizontalGlue());
		
		MainMenu.add(insertBtn);
		MainMenu.add(Box.createRigidArea(new Dimension(10, 20)));
		MainMenu.add(viewBtn);
		MainMenu.add(Box.createRigidArea(new Dimension(10, 20)));
		MainMenu.add(updateBtn);
		MainMenu.add(Box.createRigidArea(new Dimension(10, 20)));
		MainMenu.add(deleteBtn);
		insertBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		updateBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		deleteBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

		insertBtn.addActionListener(this);
		viewBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		add(MainMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(insertBtn)) {
			new InsertBoba();
			setVisible(false);
		}
		else if(e.getSource().equals(viewBtn)) {
			new ViewBoba();
			setVisible(false);
		}
		else if(e.getSource().equals(updateBtn)) {
			new UpdateBoba();
			setVisible(false);
		}
		else if(e.getSource().equals(deleteBtn)) {
			new DeleteBoba();
			setVisible(false);
		}
		
	}
	

}

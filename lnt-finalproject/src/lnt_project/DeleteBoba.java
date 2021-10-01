package lnt_project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class DeleteBoba extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JButton cancelBtn = new JButton("Cancel");
	private JButton deleteBtn = new JButton("Delete");
	
	JLabel deleteLabel = new JLabel("Input ID: ");
	JTextField deleteInput = new JTextField();
	
	JTable table;
	JButton delItemBtn;
	String id = "", name="";
	
	public DeleteBoba() {
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
		createDataView();
		createBtn();
	}
	
	private void createMenuTitle() {
		JLabel menuTitle = new JLabel("BobaCool");
		menuTitle.setFont(new Font("Verdana", Font.PLAIN, 24));
		menuTitle.setHorizontalAlignment(JLabel.CENTER);
		add(menuTitle, BorderLayout.NORTH);
	}
	
	private void createDataView() {
		 JPanel panel = new JPanel();
         panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "View Boba", TitledBorder.CENTER, TitledBorder.TOP));
	      String[][] rec = {
	         { "1", "Cheese Boba", "30000", "20", },
	         { "2", "Taro Boba", "32000", "10", },
	         { "3", "Redvelvet Boba", "35000", "20", },
	         { "4", "Original Boba", "28000", "50", },
	         { "5", "Milktea Boba", "32000", "20", },
	      };
	      String[] header = { "No", "Name", "Price", "Stock" };
	      JTable table = new JTable(rec, header);
	      table.isCellEditable(0,0);
	      panel.add(new JScrollPane(table));
	      add(panel);
	      
	}

	private void createBtn() {
		JPanel btnPanel = new JPanel();
		setSize(400, 400);
		btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.Y_AXIS));
		btnPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		btnPanel.add(deleteLabel);
		btnPanel.add(deleteInput);
		btnPanel.add(deleteBtn);
		btnPanel.add(cancelBtn);
		
		cancelBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		add(btnPanel, BorderLayout.SOUTH);
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(deleteBtn)) {
			deleteInput.setText(null);
			setVisible(false);
			new CreateMenu();
		}
		else if(e.getSource().equals(cancelBtn)) {
			new CreateMenu();
			setVisible(false);
		}
		
	}

	
}

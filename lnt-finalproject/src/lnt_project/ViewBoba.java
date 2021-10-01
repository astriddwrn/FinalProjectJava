package lnt_project;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class ViewBoba extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JButton backBtn = new JButton("Back");
	
	public ViewBoba() {
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
		createTable();
		createBtn();
	}

	private void createMenuTitle() {
		JLabel menuTitle = new JLabel("BobaCool");
		menuTitle.setFont(new Font("Verdana", Font.PLAIN, 24));
		menuTitle.setHorizontalAlignment(JLabel.CENTER);
		add(menuTitle, BorderLayout.NORTH);
	}
	
	public void createTable() {
	      JPanel panel = new JPanel();
	         panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "View Boba", TitledBorder.CENTER, TitledBorder.TOP));
	      String[][] rec = {
	         { "1", "Cheese Boba", "30000", "20" },
	         { "2", "Taro Boba", "32000", "10" },
	         { "3", "Redvelvet Boba", "35000", "20" },
	         { "4", "Original Boba", "28000", "50" },
	         { "5", "Milktea Boba", "32000", "20" },
	      };
	      String[] header = { "No", "Name", "Price", "Stock" };
	      JTable table = new JTable(rec, header);
	      panel.add(new JScrollPane(table));
	      add(panel);
	   }
	
	
	private void createBtn() {
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(1,1));
		btnPanel.add(backBtn);
		add(btnPanel, BorderLayout.SOUTH);
		backBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(backBtn)) {
			new CreateMenu();
			setVisible(false);
		}
		
	}
}

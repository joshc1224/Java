package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;


public class View implements ActionListener{

	private JTextField searchText;
	private JButton search;
	private JButton clear;
	private JButton save;
	private JLabel picture;
	private JTextField name;
	private JTextField birthday;
	private JTextField number;
	private Practicing mPractice;
	
	public View(Practicing pPractice) {
		mPractice = pPractice;
		JFrame viewer = new JFrame();
		viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewer.setSize(500, 228);
		viewer.setResizable(false);
		viewer.setTitle("Family Viewer");
		JPanel main = new JPanel();
		//main.setLayout(new BorderLayout());
		main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
		//picture adding
		JPanel pic = new JPanel();
		//pic.setBorder(new BevelBorder(1));
		Icon pictures = new ImageIcon("C:\\Users\\j\\eclipse-workspace\\NewTestingSpace\\snake.jpg");
		picture = new JLabel(pictures);
		pic.add(picture);
		
		//create right hand panel for info and buttons
		JPanel info = new JPanel();
		info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
		
		//creates the text line part of the panel
		JPanel lines = new JPanel();
		lines.setLayout(new BoxLayout(lines,BoxLayout.Y_AXIS));
		int field = 25;
		name = new JTextField(field);
		birthday= new JTextField("MM/DD/YYY");
		number = new JTextField(field);
		
		JLabel nameLabel = new JLabel("Name: ");
		JLabel bdLabel = new JLabel("Birth Date: ");
		JLabel numLabel = new JLabel("Number: ");
		Dimension user = new Dimension(10,0);
		JPanel namePanel = new JPanel();
		namePanel.add(nameLabel);
		//namePanel.add(Box.createRigidArea(user));
		namePanel.add(name);
		
		/*JPanel bdPanel = new JPanel();
		bdPanel.setLayout(new GridLayout(2,1));
		bdPanel.add(bdLabel);
		//bdPanel.add(Box.createRigidArea(user));
		bdPanel.add(birthday);
		//bdLabel.setHorizontalAlignment(0);*/
		
		JPanel numPanel = new JPanel();
		numPanel.add(numLabel);
		//numPanel.add(Box.createRigidArea(user));
		numPanel.add(number);
		
		lines.add(namePanel);
		//lines.add(bdPanel);
		//bdPanel.setAlignmentY(5);
		lines.add(numPanel);
		
		//create the button panel
		JPanel buttonPan = new JPanel();
		search = new JButton("Search");
		save = new JButton("Save");
		clear = new JButton("Clear");
		search.addActionListener(this);
		save.addActionListener(this);
		clear.addActionListener(this);
		
		buttonPan.add(search);
		buttonPan.add(save);
		buttonPan.add(clear);
		
		//add to the info panel
		info.add(lines);
		info.add(buttonPan);
		
		//add to the main panel
		//main.add(Box.createRigidArea(new Dimension(0,0)));
		main.add(picture);
		//viewer.add(Box.createVerticalGlue());
		main.add(info);
		
		//add to the JFrame
		//viewer.add(Box.createRigidArea(new Dimension(0,0)));
		viewer.add(main);
		viewer.setVisible(true);
		
		
		
	}
	
	@Override 
	public void actionPerformed(ActionEvent pEvent) {
		
	}
}

package swing;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class MoreGui implements ActionListener{

	private JLabel write = new JLabel("Big Java");
	private String font = "Serif";
	private int style = Font.PLAIN;
	private int size = 21;
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;
	private JComboBox fontName;
	private JCheckBox italics;
	private JCheckBox bold;
	
	public static void main(String[] args) {
		MoreGui test = new MoreGui();
		test.run();
	}
	
	public void run() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setLayout(new GridLayout(5,1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel words = new JPanel();
		words.setLayout(new BorderLayout());
		
		words.add(write, BorderLayout.WEST);
		
		JPanel choices = choicesPanel();
		JPanel dropMenu = dropPanel();
		JPanel boxes = checkBoxes();
		
		frame.add(new JPanel());
		frame.add(words);
		frame.add(dropMenu);
		frame.add(choices);
		frame.add(boxes);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent pEvent) {
		setLabelFont();
	}
	
	public void setLabelFont() {
		if (small.isSelected())
			size=10;
		if (medium.isSelected())
			size = 20;
		if (large.isSelected())
			size = 40;
		font = (String) fontName.getSelectedItem();
		if (italics.isSelected())
			style = style + Font.ITALIC;
		if (bold.isSelected())
			style = style + Font.BOLD;
		write.setFont(new Font(font, style, size));
		write.repaint();
	}
	
	public JPanel choicesPanel() {
		
		JPanel choices = new JPanel();
		JPanel choicesTop = new JPanel();
		JPanel choicesMid = new JPanel();
		JPanel choicesBottom = new JPanel();
		choices.setLayout(new GridLayout(3,1));
		choices.setBorder(new EtchedBorder());
		
		small = new JRadioButton("Small");
		small.addActionListener(this);
		medium = new JRadioButton("Medium");
		medium.addActionListener(this);
		large = new JRadioButton("Large");
		large.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		
		choicesMid.add(small);
		choicesMid.add(medium);
		choicesMid.add(large);
		
		choices.add(choicesTop);
		choices.add(choicesMid);
		choices.add(choicesBottom);
		
		return choices;
	}
	
	public JPanel dropPanel() {
		JPanel drop = new JPanel();
		drop.setLayout(new GridLayout(3,1));
		fontName = new JComboBox();
		fontName.addItem("Serif");
		fontName.addItem("SansSerif");
		fontName.addItem("MonoSpaced");
		fontName.addActionListener(this);
		JPanel dropTop =  new JPanel();
		JPanel dropMid = new JPanel();
		JPanel dropBottom = new JPanel();
		dropMid.add(fontName);
		
		drop.add(dropTop);
		drop.add(dropMid);
		drop.add(dropBottom);
		
		return drop;
	}
	
	public JPanel checkBoxes() {
		JPanel boxes = new JPanel();
		boxes.setLayout(new GridLayout());
		JPanel boxesInner = new JPanel();
		boxesInner.setLayout(new GridLayout(2,1));
		italics = new JCheckBox("Italics");
		bold = new JCheckBox("Bold");
		bold.addActionListener(this);
		italics.addActionListener(this);
		boxesInner.add(bold);
		boxesInner.add(italics);
		JPanel west = new JPanel();
		JPanel east = new JPanel();
		
		boxes.add(west);
		boxes.add(boxesInner);
		boxes.add(east);
		return boxes;
	}
}

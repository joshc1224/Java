package testingone;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Testing extends JFrame{

	public static void main(String[] args) {
		Testing test = new Testing();
		test.MyFrame();
	}
	
	public void MyFrame() 
	{
	JButton jb1 = new JButton("A");
	JButton jb2 = new JButton("B");
	JButton jb3 = new JButton("C");
	JButton jb4 = new JButton("D");
	JButton jb5 = new JButton("E");
	JButton jb6 = new JButton("F");
	JButton jb7 = new JButton("G");
	JButton jb8 = new JButton("H");
	JButton jb9 = new JButton("I");
	JButton jb10 = new JButton("J");
	JButton jb11 = new JButton("K");
	JButton jb12 = new JButton("L");
	JPanel jp1 = new JPanel();
	jp1.setLayout(new GridLayout(2,2));
	jp1.add(jb1);
	jp1.add(jb2);
	jp1.add(jb3);
	jp1.add(jb4);
	JPanel jp2 = new JPanel();
	jp2.add(jb5);
	jp2.add(jb6);
	jp2.add(jb7);
	jp2.add(jb8);
	JPanel jp3 = new JPanel();
	jp3.setLayout(new GridLayout(4, 1));
	jp3.add(jb9);
	jp3.add(jb10);
	jp3.add(jb11);
	jp3.add(jb12);
	JPanel jp4 = new JPanel();
	jp4.setLayout(new BorderLayout());
	jp4.add(jp1, BorderLayout.EAST);
	jp4.add(jp2, BorderLayout.CENTER);
	jp4.add(jp3, BorderLayout.SOUTH);
	add(jp4);
	setSize(400,200);
	setVisible(true);
	}

	
}

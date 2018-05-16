package recursion;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sigma implements ActionListener{

	private JTextField nums;
	private JButton calc;
	private JButton clear;
	private ArrayList<String> checks ;
	public static void main(String[] args) {
		
		Sigma sigma = new Sigma();
		sigma.run();
		
	}
	
	private void run() {
		checks = new ArrayList<String>();
		for (int i=0;i<10;i++) {
			checks.add(Integer.toString(i));
		}
		//System.out.println(calc(5));
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame main = new JFrame();
		main.setTitle("Sigma Calcualator");
		main.setSize(500, 250);
		main.setLayout(new GridLayout(2,1));
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		JButton calc = new JButton("Calc");
		JButton back = new JButton("<");
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		calc.addActionListener(this);
		back.addActionListener(this);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4,3));
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(zero);
		buttons.add(calc);
		buttons.add(back);
		
		nums = new JTextField(25);
		JPanel number = new JPanel();
		number.add(nums);
		
		main.add(number);
		main.add(buttons);
		
		main.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent pEvent) {
	}
	private int calc(int x) {
		if (x==1) {
			return 1;
		}else {return x+(calc(x-1));}
	}
}


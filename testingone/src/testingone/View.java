package testingone;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener
{
   private JTextField mText;
 private JButton mButton;
 private JLabel mLabel;
 public View()
   {
      JPanel panel = new JPanel();
     mText = new JTextField(3);
     mButton = new JButton("Even or Odd?");
       mButton.addActionListener(this);
     mLabel = new JLabel();
     JPanel newPanel = new JPanel();
    
       panel.add(mText); 
       panel.add(mButton);
       panel.add(mLabel);
     add(panel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(250, 100);
       setTitle("Even or Odd");
     setVisible(true);
     }
	
	public void actionPerformed(ActionEvent pEvent) {
		if (pEvent.getSource() instanceof JButton) {
			int num = Integer.parseInt(mText.getText());
			if(num%2==0) {
				mLabel.setText("Even");
			}else {mLabel.setText("Odd");}
		}
	}
} 
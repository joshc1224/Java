package swing;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class GUI {

	
	public GUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton okBut = newButton("OK", 20, 30);
		JButton canxBut = newButton("Cancel", 20, 60);
		JButton quitter = newButton("Quit", 20, 60);
		
		JPanel buttonPan = new JPanel();
		buttonPan.setLayout(new BoxLayout(buttonPan, BoxLayout.X_AXIS));
		buttonPan.add(Box.createHorizontalGlue());
		buttonPan.add(okBut);
		buttonPan.add(Box.createRigidArea(new Dimension(20, 0)));
		buttonPan.add(canxBut);
		buttonPan.add(Box.createRigidArea(new Dimension(20, 0)));
		buttonPan.add(quitter);
		buttonPan.add(Box.createHorizontalGlue());
		
				
		JPanel mid = new JPanel();
		JLabel midLabel = new JLabel("");
		mid.add(Box.createRigidArea(new Dimension(0, 150)));
		mid.add(midLabel);
		
		//label calls after this line
		okBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pEvent) {
				midLabel.setText("You pressed OK");
			}
		});
		canxBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pEvent) {
				midLabel.setText("You pressed Cancel");
			}
		});
		final JPanel main = new JPanel();
		
		quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pEvent) {
				if (pEvent.getActionCommand().equals("Quit")) {
					quit(main);
				}
				
			}
		});
		
		//final JPanel main = new JPanel();
		main.setLayout(new BorderLayout());
		main.add(buttonPan, BorderLayout.SOUTH);
		main.add(mid, BorderLayout.CENTER);
		
		frame.add(main);
		frame.setVisible(true);
	}
	
	private JButton newButton(String text, int x, int y) {
		
		JButton button = new JButton(text);
		button.setSize(x, y);
		return button;
		
	}
	
	private void quit(JPanel panel) {
		JOptionPane.showMessageDialog(panel, "GoodBye", "Exit", JOptionPane.PLAIN_MESSAGE);
		System.exit(-1);
	}

	/*private class ButtonListener implements ActionListener{
		
		private JLabel mLabel;
		private String mText;
		
		public ButtonListener(JLabel label, String text) {
			mLabel = label;
			mText = text;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(arg0.getActionCommand());
			if(arg0.getActionCommand().equals("Quit")) {
				System.exit(-1);
			}else
			mLabel.setText(mText);
		}
	}*/
	
}

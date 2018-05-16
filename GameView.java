import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GameView implements ActionListener {
	JButton forward, backward, left, right, swing;
	public GameView(int x, int y){
		
		JFrame frame = new JFrame("GameViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(400,400);
		frame.setResizable(false);
		
		
		
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent e){
		
		System.out.println(e.getActionCommand());
		
	}
}
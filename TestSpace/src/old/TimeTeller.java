package old;

import javax.swing.JOptionPane;

public class TimeTeller {
	
	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("enter the first time:");
		String time2 = JOptionPane.showInputDialog("enter the second time:");
		int time1Int = Integer.parseInt(time1);
		int time2Int = Integer.parseInt(time2);
		int difference = Math.abs(time1Int-time2Int);
		JOptionPane.showMessageDialog(null, "The time difference is: "+difference);
		
	}

}

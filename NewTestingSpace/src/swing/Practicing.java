package swing;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Practicing {

	
	private View mView;
	public static void main(String[] args) {
		Practicing practice = new Practicing();
		practice.run();
	}
	
	private void run() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		mView = new View(this);
		
		
	}
	
}

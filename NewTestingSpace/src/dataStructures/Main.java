package dataStructures;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	private void run() {
		
		DList list = new DList(1);
		list.append(2);
		list.append(3);
		list.prepend(0);
		System.out.println("First "+list);
		list.clear();
		System.out.println("Now "+list);
		
		
	}
	
}

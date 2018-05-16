package classes;
import java.util.*;
public class TestingClass {

	public static void main(String[] args) {
		
		ArrayList<Mammal> players = new ArrayList<Mammal>();
		Mammal chester = new Dog();
		players.add(chester);
		chester.setName("Chester");
		Dog test = new Dog();
		test.setNoise("Woof");
		//System.out.println(test.getPosition());
		test.setName("Dog1");
		Cat test2 = new Cat();
		test2.setNoise("Meow");
		//System.out.println(test2.getPosition());
		test2.setName("Cat1");
		players.add(test);
		players.add(test2);
		for (Mammal x:players) {
			System.out.println(x);
		}
	}	
}

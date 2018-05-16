package questions;

public class QuestionDriver {
	
	public static void main(String[] args) {
		
		Question q1= new Question("Is this a question?", "yes");
		System.out.println(q1);
		
		String userAnswer="yes";
		
		if (q1.answerQuestion(userAnswer)) {
			System.out.println("You are Correct.");
		}else {System.out.println("You are incorrect.");}
		
	}

}

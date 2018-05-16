package questions;

public class Question {
	
	private String question;
	private String answer;
	private int complexityLevel;
	
	public Question(String initQuestion, String initAnswer) {
		
		question = initQuestion;
		answer = initAnswer;
		setComplexityLevel(1);
		
	}

	public int getComplexityLevel() {
		return complexityLevel;
	}

	public void setComplexityLevel(int complexityLevel) {
		this.complexityLevel = complexityLevel;
	}
	
	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}
	
	public boolean answerQuestion(String userAnswer) {
		return answer.equalsIgnoreCase(userAnswer);
	}
	public String toString() {
		return "The question is \""+question+ 
				"\"\nWith an answer of \""+answer+"\"."+
				"\nThe complexity of the question is: "+complexityLevel;
	}
}

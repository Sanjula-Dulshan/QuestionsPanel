package com.question;

public class Question {
	private int id;
	private String subName;
	private String qDate;
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String correctAnswer;
	
	public Question(int id, String subName, String qDate, String question, String answer1,String answer2, String answer3, String answer4, String correctAnswer) {
		this.id = id;
		this.subName = subName;
		this.qDate = qDate;
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.correctAnswer = correctAnswer;
	}

	public int getId() {
		return id;
	}

	public String getSubName() {
		return subName;
	}


	public String getqDate() {
		return qDate;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer1() {
		return answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	
	
	
	
	

}

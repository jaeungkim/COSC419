package Assignment2.Q2;

public abstract class Mood {

	private String condition;
	private int grade;

	public Mood(String condition, int grade) {
		super();
		this.condition = condition;
		this.grade = grade;
	}

	public String getCondition() {
		return condition;
	}

//	public int getGrade() {
//		return grade;
//	}

	abstract void decision();
	abstract void decision2();
	abstract void decision3();
	abstract void decision4();

}

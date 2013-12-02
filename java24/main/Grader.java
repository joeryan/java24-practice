package java24.main;

public class Grader {
	private int grade;
	
	public Grader(int grade) {
		this.grade = grade;
	}
	
	public char getGrade() {
		if (grade >= 90) {
			return 'A';
		} else if (grade >= 80) {
			return 'B';
		} else if (grade >= 70) {
			return 'C';
		} else if (grade >= 60) {
			return 'D';
		} else {
			return 'E';
		}
	}
}

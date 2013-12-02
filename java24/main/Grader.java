package java24.main;

public class Grader {
	private int grade;
	
	public Grader(int grade) throws IllegalArgumentException {
		if (grade >= 0 && grade <= 100) {
			this.grade = grade;
		} else throw new IllegalArgumentException();
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

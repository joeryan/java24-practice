package java24.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {

	@Test
	public void test_gradeA() {
		Grader myGrade = new Grader(90);
		assertEquals('A', myGrade.getGrade());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGradeGreaterThan100() {
		Grader myGrade = new Grader(101);
		System.out.println(myGrade.getGrade());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGradeLessThan0() {
		Grader myGrade = new Grader(-1);
		System.out.println(myGrade.getGrade());
	}

}

package java24.main;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Parameterized.class)
public class GraderTest {
	private int inputGrade;
	private char expectedResult;
	private Grader grader;
	
	@Before
	public void initialize() {
		grader = new Grader(inputGrade);
	}
	
	public GraderTest(int inputGrade, char expectedResult) {
		this.inputGrade = inputGrade;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection <Object[]> Grades() {
		return Arrays.asList(new Object[][] {
				{100, 'A'},
				{90, 'A'},
				{89, 'B'},
				{80, 'B'},
				{79, 'C'},
				{70, 'C'},
				{69, 'D'},
				{60, 'D'},
				{59, 'E'},
				{0,'E'} 
		});
	}
	
	@Test
	public void testGrader() {
		assertEquals(expectedResult, grader.getGrade());
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

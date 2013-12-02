package java24.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {

	@Test
	public void test_getGrade() {
		Grader myGrade = new Grader(90);
		assertEquals('A', myGrade.getGrade());
	}

}

package java24.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java24.main.Squarexy;

public class SquarexyTest extends Squarexy {

	@Test
	public void test() {
		Squarexy sqr = new Squarexy();
		assertEquals((25+5)*(25+5), sqr.sqr(25, 5), 0);
	}

}

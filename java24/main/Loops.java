package java24.main;

public class Loops {
	
	
	public static void main(String[] args) {
		Loops.forLoopNines();
		Loops.whileLoop();
		Loops.doWhileLoop();
	}
	
	protected static void forLoopNines() {
		System.out.println("for loops for 100 iterations");
		for (int multiplier = 1; multiplier < 100; multiplier++) {
			int multiple = 9 * multiplier;
			System.out.print(multiple + " ");
			if (multiplier% 20 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println();
	}
	
	protected static void whileLoop() {
		int limit = 5;
		int count = 1;
		System.out.println("while loop for 5 iterations");
		while (count < limit) {
			System.out.println("This is line number " + count + ".");
			count ++;
		}
	}
	
	protected static void doWhileLoop() {
		int limit = 5;
		int count = 6;
		
		System.out.println("do-while loop with one iteration showing 'execution-before-test'");
		do {
			System.out.println("This will only print when " + count + " is less than " + limit);
			count ++;
		} while (count < limit);
	}
}

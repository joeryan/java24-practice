package java24.main;

public class Loops {
	
	
	public static void main(String[] args) {
		Loops.forLoopNines();
		Loops.whileLoop();
	}
	
	protected static void forLoopNines() {
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
		while (count < limit) {
			System.out.println("This is line number " + count + ".");
			count ++;
		}
	}
}

package java24.main;

public class Loops {
	
	
	public static void main(String[] args) {
		Loops.forLoopNines();
	}
	
	protected static void forLoopNines() {
		for (int multiplier = 1; multiplier < 100; multiplier++) {
			int multiple = 9 * multiplier;
			System.out.print(multiple + " ");
			if (multiplier% 20 == 0) {
				System.out.println("\n");
			}
		}
	}
		
}


public class PlanetWeight {
	public static void main(String[] args) {
		final double MERCURY = .378;
		final double MOON = .166;
		final double JUPITER = 2.364;
		
		System.out.print("Your weight on Earth is ");
		double weight = 205;
		System.out.println(weight);
		
		System.out.print("Your weight on Mercury is ");
		System.out.println(weight * MERCURY);
		
		System.out.print("Your weight on the Moon is ");
		System.out.println(weight * MOON);
		
		System.out.print("Your weight on Jupiter is ");
		System.out.println(weight * JUPITER);
	}
}

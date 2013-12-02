
public class Credits {
	public static void main(String[] arg) {
		String title = "The Piano";
		int year = 1993;
		String director = "Jane Campion";
		String[] role = {"Ada","Baines", "Stewart", "Flora" };
		String[] actor = {"Holly Hunter","Harvey Keitel","Sam Neill", "Anna Paquin" };
		
		System.out.print(title + " (" + year + ") A " + director + "film. ");
		for (int i = 0; i <= 3; i++) {
			System.out.print("\n       " + role[i] + "            " + actor[i].toUpperCase() + "     ");
			
		}
	}
}

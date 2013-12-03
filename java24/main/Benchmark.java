package java24.main;

import java.util.*;

public class Benchmark {
	public static int getIterations(int minutes) {
		Calendar start = Calendar.getInstance();
		for (int i = 0;i < minutes; i++) {
			start.roll(Calendar.MINUTE, true);
		}
		
		int nextMinute = start.get(Calendar.MINUTE);
		int nextSecond = start.get(Calendar.SECOND);
		int index = 0;
		while (true) {
			double x = Math.sqrt(index);
			Calendar now = Calendar.getInstance();
			if (now.get(Calendar.MINUTE) >= nextMinute) {
				if (now.get(Calendar.SECOND) >= nextSecond) {
					System.out.println(x);
					break;
				}
			}
			index++;
		}
		return index;
	}
	
	public static void main(String[] args) {
		int index;
		int minutesToRun = 2;
		
		index = getIterations(minutesToRun);
		System.out.println(index + " loops in " + minutesToRun + ( (minutesToRun > 1) ? " minutes." : " minute.") );
	}
}

package java24.main;

import java.util.*;

public class Benchmark {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.roll(Calendar.MINUTE, true);
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
		System.out.println(index + " loops in one minute.");
	}
}

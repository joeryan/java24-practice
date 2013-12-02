package java24.main;

import java.util.*;

public class Clock {
	private int hour;
	private int minute;
	private int month;
	private int day;
	private int year;
	
	public Clock() {
		Calendar now = Calendar.getInstance();
		this.hour = now.get(Calendar.HOUR_OF_DAY);
		this.minute = now.get(Calendar.MINUTE);
		this.month = now.get(Calendar.MONTH);
		this.day = now.get(Calendar.DAY_OF_MONTH);
		this.year = now.get(Calendar.YEAR);
	}
		
	public static void main(String[] args) {
		Clock myClock = new Clock(Calendar.getInstance());
		myClock.displayGreeting();
	}
	
	protected void displayGreeting() {
		if (hour < 12) {
			System.out.println("Good morning. \n");
		} else if (hour < 17) {
			System.out.println("Good afternoon.\n");
		} else {
			System.out.println("Good evening.\n");
		}
			
		System.out.print("It's ");
		if (minute != 0) {
			System.out.print(minute + " ");
			System.out.print( (minute != 1) ? "minutes" : "minute");
			System.out.print(" past ");
		}
		System.out.print ( ( hour > 12) ? (hour - 12) : hour);
		System.out.print( " o'clock on ");
		System.out.println(this.showMonth() + " " + day + ", " + year + ".");
	}
	
	private String showMonth() {
		String months[] = {"January", "February", "March", "April", "May", "June", "July",
		                   "August", "September", "October", "November", "December"};
		return months[this.month];
	}
}

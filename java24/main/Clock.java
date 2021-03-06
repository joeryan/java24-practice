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
		Clock myClock = new Clock();
		System.out.println(myClock.getGreeting());
	}
	
	public String getGreeting() {
		String greeting = "Good " + getPeriod();
		greeting += "It's " + getTime();
		greeting += " " + showDate();
		
		return greeting;
	}
	
	private String showDate() {
		String months[] = {"January", "February", "March", "April", "May", "June", "July",
		                   "August", "September", "October", "November", "December"};
		return months[month] + " " + day + ", " + year + ".";
	}
	
	private String getPeriod() {
		if (hour < 12) {
			return "morning. \n";
		} else if (hour < 17) {
			return "afternoon.\n";
		} else {
			return "evening.\n";
		}
	}
	
	private String getTime() {
		String greeting = "";
		
		if (minute != 0) {
			greeting += minute + " ";
			greeting += (minute != 1) ? "minutes" : "minute";
			greeting += " past ";
		}
		greeting += ( hour > 12) ? (hour - 12) : hour;
		greeting += " o'clock";
		
		return greeting;
	}
}

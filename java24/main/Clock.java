package java24.main;

import java.util.*;

public class Clock {
	public static void main(String[] args) {
			Calendar now = Calendar.getInstance();
			int hour = now.get(Calendar.HOUR_OF_DAY);
			int minute = now.get(Calendar.MINUTE);
			int month = now.get(Calendar.MONTH)+1;
			int day = now.get(Calendar.DAY_OF_MONTH);
			int year = now.get(Calendar.YEAR);
			
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
			
			switch (month) {
				case 1:
					showMonth("January");
					break;
				case 2:
					showMonth("February");
					break;
				case 3:
					showMonth("March");
					break;
				case 4:
					showMonth("April");
					break;
				case 5:
					showMonth("May");
					break;
				case 6:
					showMonth("June");
					break;
				case 7:
					showMonth("July");
					break;
				case 8:
					showMonth("August");
					break;
				case 9:
					showMonth("September");
					break;
				case 10:
					showMonth("October");
					break;
				case 11:
					showMonth("November");
					break;
				case 12:
					showMonth("December");
					break;
				default:
					System.out.println("Error!!");
			}
			
			System.out.println(" " + day + ", " + year + ".");
	}
	
	private static void showMonth(String month) {
		System.out.print(month);
	}
}

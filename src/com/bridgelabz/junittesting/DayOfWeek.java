package com.bridgelabz.junittesting;

import java.util.Scanner;

public class DayOfWeek 
{
	
	private static final String[] weeks = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	
	private static void dayOfWeek(int m, int d, int y) 
	{
		int y0 = y - (14-m) / 12;
		int x = y0 + (y0/4)- (y0/100) + (y0/400);
		int m0 = m + 12 * ((14-m)/12)-2;
		int d0 = (d+x+31*m0/12)% 7;
		System.out.println("The entered date is : " + d + "-"+ m +"-"+ y);
		System.out.println("The day is: "+weeks[d0]);
	}

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter day");
		int day = scanner.nextInt();
		System.out.println("Enter month");
		int month = scanner.nextInt();
		System.out.println("Enter year");
		int year = scanner.nextInt();
		dayOfWeek(month,day,year);

	}

	
}

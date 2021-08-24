package com.bridgelabz.junittesting;

import java.util.Scanner;

public class SquareRoot 
{
	private static final double EPSILON = Math.pow(2.7182, -15);
	
	private static void sqrt(int number) 
	{
		double t = number;
		while(true) 
		{
			t = 0.5*(t + (number / t));
			if(Math.abs(t-(number/t)) < EPSILON*t) 
			{
				break;
			}
		}
		System.out.println("SquareRoot is : "+t);
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the square root");
		int number = scanner.nextInt();
		sqrt(number);
		

	}
	
}
	


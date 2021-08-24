package com.bridgelabz.junittesting;

import java.util.Scanner;
public class Binary 
{
	
	static void powerOf2(int swappedNumber) 
	{
		
		int num = 1;
		while(num <= swappedNumber) 
		{
			num = num * 2;
			if(num == swappedNumber) 
			{
				System.out.println("Power of 2");
				return;
			}
		}
		System.out.println("Not a power of 2");

	}
	
	
	static int swapNibbles(int number)
	{
		return ((number & 0x0F) << 4 | ((number & 0xF0) >> 4));
	}

	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int swappedNumber = swapNibbles(number);
		System.out.println("Number generated after Swapping nibbles :"+ swappedNumber);
		powerOf2(swappedNumber);
		
	}
}

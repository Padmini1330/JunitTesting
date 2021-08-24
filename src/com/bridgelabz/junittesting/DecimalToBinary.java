package com.bridgelabz.junittesting;

import java.util.Scanner;

public class DecimalToBinary 
{

	private static void toBinary(int number) 
	{
		int index=31;
		int[] binaryNumber = new int[32];
		
		while(number >0) 
		{
			binaryNumber[index] = number % 2;
			index--;
			number = number / 2;
		}
		System.out.println("The Binary conversion is : ");
		for(index=0;index<32;index++) 
		{
			System.out.print(binaryNumber[index]);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int number = scanner.nextInt();
		toBinary(number);
	}

}
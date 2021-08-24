package com.bridgelabz.junittesting;

import java.util.Scanner;
public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the change to be received from Vending Machine");
		int change=scanner.nextInt();
		int denomination[]= {1000,500,100,50,10,5,2,1};
		int changeCount=0;
		int sum=0;
		
			for(int index=0;index<denomination.length;index++)
			{
				if(change>=0)
				{
					if((change / denomination[index])>= 1)
					{
						changeCount=(change/denomination[index]);
						sum+=changeCount;
						change-=(denomination[index]* (changeCount)) ;
						
						System.out.println(denomination[index]+ " * "+ changeCount);
						
					}
				}
			}
		System.out.println();
		System.out.println(sum+" denominations are required to generate the changes");
		
	}
}

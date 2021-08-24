package com.bridgelabz.junittesting;

import java.util.Scanner;
public class MonthlyPayment 
{
	
	private static void monthlyPayment(double p, double y, double r) 
	{
		double n = 12 * y;
		double rate = r / (12*100);
		double payment = (p*rate)/(1-(Math.pow(1+rate,-n)));
		System.out.println("The payment is : "+ payment);
	}
	
	
	public static void main(String[] args) 
	
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Principle");
		double principle  = scanner.nextDouble();
		System.out.println("Enter Year");
		double year  = scanner.nextDouble();
		System.out.println("Enter Rate of interest");
		double rateOfInterest  = scanner.nextDouble();
		monthlyPayment(principle, year, rateOfInterest);
	}
	

}

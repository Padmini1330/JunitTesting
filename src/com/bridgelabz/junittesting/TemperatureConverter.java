package com.bridgelabz.junittesting;

import java.util.Scanner;

public class TemperatureConverter {
	private static void temperatureConversion(int temperatureFahrenheit,int temperatureCelsius)
	{
		int newFahrenheit=(temperatureCelsius * 9/5) + 32 ;
		int newCelsius=(temperatureFahrenheit - 32) * 5/9;
		System.out.println("Entered Fahrenheit: "+ temperatureFahrenheit +"----->"+ "Converted to Celsius: "+ newCelsius);
		System.out.println("Entered Celsius: "+ temperatureCelsius +"----->"+ "Converted to Fahrenheit : "+ newFahrenheit);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		int temperatureFahrenheit = scanner.nextInt();
		System.out.println("Enter Temperature in Celsius");
		int temperatureCelsius = scanner.nextInt();
		temperatureConversion(temperatureFahrenheit, temperatureCelsius);

	}

}

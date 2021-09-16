package com.bridgelabz;

import java.util.Scanner;

public class LargestOfThreeNumber {

	
	public static void main(String[] args) {
		 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter The Number1: ");
		int number1 = reader.nextInt();
		
		System.out.println("Enter The Number2: ");
		int number2 = reader.nextInt();
		
		System.out.println("Enter The Number3: ");
		int number3 = reader.nextInt();
		
		if (number1>number3 && number1>number3)
		{
			System.out.println("First Number Is Largest:");
		}
		else if(number2>number1 && number2>number3)
		{
			System.out.println("Second Number Is Largest:");
		}
		else
		{
			System.out.println("Third NUmber Is Largest:");
		}
		}


	
		

	}




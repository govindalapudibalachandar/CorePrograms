package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		  
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int even = reader.nextInt();
		
	//	System.out.println("Enter a Odd Number: ");
	//	int odd = reader.nextInt();//
		
	    
	    
		if (  even %2 == 0  )
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is odd number");
		}
}

}

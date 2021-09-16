package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a LeapYear:");
		int year = reader.nextInt();
		
		if( year % 400 ==0)
		{
			System.out.println("Is A LeapYear:"+year);
		}
		else if(year%4 ==0 && year%100!=0)
		{
	  
			System.out.println("Is A leapYear:"+year);
		}
		else
		{
			System.out.println("Not A LeapYear");
		}
}
}
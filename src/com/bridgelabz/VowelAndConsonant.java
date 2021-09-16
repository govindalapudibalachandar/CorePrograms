package com.bridgelabz;

import java.util.Scanner;

public class VowelAndConsonant {

public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		 
		System.out.println("Enter a Alphabet: ");
		char alphabet = reader.next().charAt(0);
		
		if ( alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet =='o' || alphabet =='u')
		{
			System.out.println("It is a Vowel:" +alphabet);
		}
		
			else
			{
		    System.out.println("It is a Constant");
}
}
}


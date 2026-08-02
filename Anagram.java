package com.studycse;

import java.util.Arrays;           //facilities for Arrays bcz aage Arrays use hoga      
import  java.util.Scanner;          // Scanner user se input ke liye hota h

public class Anagram {               // class name
	
	
	public static void main(String[] args) {            // main method ....program start from this point
		Scanner sc = new Scanner(System.in);            // scanner = keyboard se input lena h 
		System.out.println("Enter first string : ");      // print on screen 
		String str1 = sc.nextLine();                      // store in input or save
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		
		str1 = str1.replaceAll("\\s"," ").toLowerCase();  //bich me space ho to hata degi aur lowercase(small letter)  bana degi taki
		                                                  //comparision easy ho
		
		
		str2 = str2.replaceAll("\\s"," ").toLowerCase();
		
		if( str1.length()!= str2.length() ) {                       // length check
			System.out.println(" Not Anagrams");
		}
		else {
			char[] a=str1.toCharArray();               //convert into character array bcz sbko ek sath sort nhi kr skta
			char[] b=str2.toCharArray();
			
			Arrays.sort(a);                           //sorting = arranging in alphabet no.
			Arrays.sort(b);
			
			if(Arrays.equals(a, b)) {                 // compare
				System.out.println("Anagrams");
			}
			else {
				System.out.println("Not Anagrams");
			}
		}
		
		sc.close();                                    // scanner ko band kr deta h
			
	}
	
}

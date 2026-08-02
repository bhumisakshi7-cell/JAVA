package com.studycse;

import java.util.Arrays;               
import  java.util.Scanner;          

public class Anagram {               
	
	
	public static void main(String[] args) {           
		Scanner sc = new Scanner(System.in);             
		System.out.println("Enter first string : ");      
		String str1 = sc.nextLine();                      
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		
		str1 = str1.replaceAll("\\s"," ").toLowerCase();  
		
		
		str2 = str2.replaceAll("\\s"," ").toLowerCase();
		
		if( str1.length()!= str2.length() ) {                       
			System.out.println(" Not Anagrams");
		}
		else {
			char[] a=str1.toCharArray();              
			char[] b=str2.toCharArray();
			
			Arrays.sort(a);                           
			Arrays.sort(b);
			
			if(Arrays.equals(a, b)) {                 
				System.out.println("Anagrams");
			}
			else {
				System.out.println("Not Anagrams");
			}
		}
		
		sc.close();                                    
			
	}
	
}

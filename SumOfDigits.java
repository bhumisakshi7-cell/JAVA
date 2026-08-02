package com.studycse;
import java.util.Scanner;
public class SumOfDigits {

//	public SumOfDigits() {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
	        System.out.println("Enter an integer between 0 and 1000: ");
	        int number = sc.nextInt();
	        int original = number;                                            
	        int sum = 0;                                                      
	        while (number > 0) {                                               
	          int digit = number % 10;                                       
	            sum = sum + digit;                                           
	            number = number / 10;                                        
	        }
  System.out.println("The sum of the digits of " + original + " is " + sum);     

	        sc.close();

	  }
	}
//}

package com.studycse;
import java.util.Scanner;
public class SumOfDigits {

//	public SumOfDigits() {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
	        System.out.println("Enter an integer between 0 and 1000: ");
	        int number = sc.nextInt();
	        int original = number;                                            // Store original number
	        int sum = 0;                                                      // Variable to store sum
	        while (number > 0) {                                               // Find sum of digits
	          int digit = number % 10;                                        // Get last digit
	            sum = sum + digit;                                           // Add digit to sum
	            number = number / 10;                                        // Remove last digit
	        }
  System.out.println("The sum of the digits of " + original + " is " + sum);     // Output

	        sc.close();

	  }
	}
//}

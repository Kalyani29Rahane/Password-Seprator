package com.tka;
import java.util.Scanner;
public class Demo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();

	        // Use StringBuilder for better performance
	        StringBuilder letters = new StringBuilder();
	        StringBuilder digits = new StringBuilder();
	        StringBuilder specialChars = new StringBuilder();

	        // Loop through characters and classify
	        for (int i = 0; i < password.length(); i++) {
	            char ch = password.charAt(i);

	            if (isLetter(ch)) {
	                letters.append(ch);
	            } else if (isDigit(ch)) {
	                digits.append(ch);
	            } else {
	                specialChars.append(ch);
	            }
	        }

	        // Output
	        System.out.println("Letters: " + letters);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special Characters: " + specialChars);

	        scanner.close();
	    }

	    // Helper method to check if character is a letter
	    private static boolean isLetter(char ch) {
	        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	    }

	    // Helper method to check if character is a digit
	    private static boolean isDigit(char ch) {
	        return ch >= '0' && ch <= '9';
	    }
	}



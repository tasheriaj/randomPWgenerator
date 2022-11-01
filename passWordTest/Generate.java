package passWordTest;

import java.util.Random;
import java.util.Scanner;



public class Generate {

	public static void main(String[] args) {
		
		
		password();
	
	}
	public static char[] password() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your length 8-128:");
		int userPick = sc.nextInt();
		 
		
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	      String specialChars = "!@#$";
	      String numbers = "1234567890";
	      String allChars = upperCase + lowerCase + specialChars + numbers;
	      Random random = new Random();
	      
	      char[] password = new char[userPick];
	      
	      
	      password[0] = upperCase.charAt(random.nextInt(upperCase.length()));
    	  password[1] = lowerCase.charAt(random.nextInt(lowerCase.length()));
		  password[2] = numbers.charAt(random.nextInt(numbers.length()));
		  password[3] = specialChars.charAt(random.nextInt(specialChars.length()));
	      
	      for(int i = 0 ; i >= userPick ; i++) {
	    	        
	    	  password[userPick] = allChars.charAt(random.nextInt(allChars.length()));
	    	  	      
	      }
	      
	       
	     
		return password;
		
		
	}
}
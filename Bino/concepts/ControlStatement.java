package core.concepts;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String gender="";
		System.out.println("Enter The Marital Status: (Married/Unmarried): ");
		String ms = in.nextLine();
		
		if(ms .equals("married")) {
			System.out.println("You are Eligible to the insurance...");
		}
		else if(ms.equals("unmarried")) {
			System.out.println("Enter The your gender: (Male/Female): ");
			gender = in.nextLine().toLowerCase();
		}
		else {
			System.out.println("Invalid Gender...");
		}
			
			
		if(gender .equals("male")||gender .equals("female")) {
			System.out.println("Enter your age: ");
			int age = in.nextInt();
				
			if(gender .equals("male")) {
				if(age>=30) {
					System.out.println("You are Eligible to the insurance...");
			}
			else {
					System.out.println("You are not Eligible to the insurance...");
			}
		}
		else if(gender.equals("female")) {
			if(age>=25) {
				System.out.println("You are Eligible to the insurance...");
			}
			else {
					System.out.println("You are not Eligible to the insurance...");
			}
				}
					
			}
		
			
		else {
			System.out.println("Invalid marital status...");
		}
	}



}

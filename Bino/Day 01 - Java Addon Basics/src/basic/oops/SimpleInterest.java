package basic.oops;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Principle ampunt: ");
		int p = in.nextInt();
		System.out.println("Enter the No of Months: ");
		int n = in.nextInt();
		System.out.println("Enter the Rate of interest: ");
		int r = in.nextInt();
		float res = p * n * r / 100;
		
		System.out.println("Interest amount: "+res);

	}

}

package core.concepts;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Character(a to z): ");
		char c = in.next().charAt(0);
		switch (c) {
		case 'a':{
			System.out.println(c+" is a vowel");
			break;
		}
		case 'e':{
			System.out.println(c+" is a vowel");
			break;
		}
		case 'i':{
			System.out.println(c+" is a vowel");
			break;
		}
		case 'o':{
			System.out.println(c+" is a vowel");
			break;
		}
		case 'u':{
			System.out.println(c+" is a vowel");
			break;
		}
		default:
			System.out.println(c+" is consonant...");
			break;
		}
		

	}

}

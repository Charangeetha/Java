package Charan;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner mon= new Scanner(System.in);
		System.out.println("Enter any 3 Letters of a Month");
		String option = mon.next();
		switch (option) {
		case "jan" :
			System.out.println("January");
			break;
		case "feb" :
			System.out.println("Febraury");
			break;
		case "mar" :
			System.out.println("March");
			break;
		case "apr" :
			System.out.println("April");
			break;
		case "may" :
			System.out.println("May");
			break;
		case "jun" :
			System.out.println("June");
			break;
		case "jul" :
			System.out.println("July");
			break;
		case "aug" :
			System.out.println("August");
			break;
		case "sep" :
			System.out.println("September");
			break;
		case "oct" :
			System.out.println("October");
			break;
		case "nov" :
			System.out.println("November");
			break;
		case "dec" :
			System.out.println("December");
			break;
		default :
			System.out.println("Please Enter Correct Letters");
		}
		
	}

}

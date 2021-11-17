package Charan;

import java.util.Scanner;

public class Oddoreven {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=in.nextInt();
		
		switch (num%2) {
		case 0:
			System.out.println("It is a Even Number");
			break;
		case 1:
			System.out.println("It is a odd Number");
		
		}
	}

}

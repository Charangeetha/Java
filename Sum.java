package Charan;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int i =0;
		do {
			System.out.println("Enter NUmber");
			num[i] = sc.nextInt();
			i=i+1;
			
		}while(i<10);
		int sum=0;
		int x=0;
		do {
			System.out.println("print1"+sum);
			sum=sum+num[x];
			x = x+1;
			
			
		}while(x<11);
		
	}

}

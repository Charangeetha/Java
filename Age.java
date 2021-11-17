package Charan;

public class Age {
	public static void main(String[] args) {
		int age =0;
		if (age>=1 && age <=12) {
			System.out.println("Kiddo");
		}
		else if (age>=13 && age<=19) {
			System.out.println("Teenager");
		}
		else if (age>=20 && age<=34) {
			System.out.println("Youth");
		}
		else if(age>=35 && age<=59) {
			System.out.println("Middle age");
		}
		else if (age>=60 && age<=119) {
			System.out.println("Old age");
		}
		
		else {
			System.out.println("rip");
		}
	}

}

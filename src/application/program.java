package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1º number: ");
		int x = sc.nextInt();
		System.out.println("Enter 2º number: ");
		int y = sc.nextInt();
	
		int s = sum(x,y);
		int w = sub(x,y);
		int a = mult(x,y);
		double t = div(x,y);
		double j= mold (x,y);
		
		System.out.println("Result: "+s);
		System.out.println("Result: " + w); 
		System.out.println("Result: "+ a);
		System.out.printf("Result: %.2f%n", t);
		System.out.println("Result: "+ j);
		sc.close();
		

	}
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
	public static int mult(int x, int y) {
		return x * y;
	}
	
	public static int div(int x, int y) {
		return x / y;
	}
	public static int mold(int x, int y) {
		return x % y;
	}
	

}

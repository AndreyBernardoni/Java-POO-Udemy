package application;

import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double r = sc.nextDouble();
		
		double c = Calculator.circumference(r);
		double v = Calculator.volume(r);
		
		System.out.printf("circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", Calculator.PI);
		
		sc.close();
	}
	


}

package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double r = CurrencyConverter.dollarToReal(amount, price);
		System.out.printf("Amount to be paid in reais = %.2f", r);
		
		
		
		
		sc.close();
	}

}

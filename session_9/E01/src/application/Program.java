package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Initial deposit? (y/n) ");
		char aux = sc.next().charAt(0);
		
		if (aux == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, name, initialDeposit);
		}else {
			acc = new Account(number, name);
		}
		
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		
		System.out.println("\nUpdated account data: ");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		
		System.out.println("\nUpdated account data: ");
		System.out.println(acc);
		
		
		sc.close();

	}

}

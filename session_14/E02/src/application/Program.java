package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		List <TaxPayer> taxPayers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		Double taxSum = 0.0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Enter the name: ");
			String name = sc.next();
			System.out.print("Enter the anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Enter the health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayers.add(new Individual(name, income, healthExpenditures));
			} else {
				System.out.print("Enter the number of employees: ");
				int employees = sc.nextInt();
				taxPayers.add(new Company(name, income, employees));
			}

		}

		System.out.println("TAXES PAID:");
		for (TaxPayer tp : taxPayers) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
			taxSum += tp.tax();
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $" + taxSum);

		sc.close();
	}	
}

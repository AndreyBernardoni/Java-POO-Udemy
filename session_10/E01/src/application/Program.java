package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("\nRent #"
					+ i 
					+":\nName: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rent[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		
		for (int i=0; i<10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
			
		sc.close();
			
		}
	}
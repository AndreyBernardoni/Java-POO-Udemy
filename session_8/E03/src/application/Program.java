package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.print("Digite seu nome: ");
		std.nome = sc.nextLine();
		
		System.out.print("Digite sua primeira nota: ");
		std.n1 = sc.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		std.n2 = sc.nextDouble();
		System.out.print("Digite sua terceira nota: ");
		std.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + std.calcTotal());
		
		if (std.calcTotal()<60) {
			System.out.println("FAILED");
			System.out.println("MISSING " + std.calcFalta() + " POINTS");
		}else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}

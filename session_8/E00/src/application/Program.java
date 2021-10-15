package application;

import java.util.Scanner;

import entities.Triangle;

//SEM POO

/*public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.print("Digite as medidas do trinagulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.print("Digite as medidas do trinagulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA+xB+xC)/2.0;
		double areaX = Math.sqrt(p*(p-xA) * (p-xB)* (p-xC));
		
		p = (yA+yB+yC)/2.0;
		double areaY = Math.sqrt(p*(p-yA) * (p-yB)* (p-yC));
		
		System.out.printf("Área do triangulo X: %.4f%n",areaX);
		System.out.printf("Área do triangulo Y: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();


	}

}*/

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.print("Digite as medidas do trinagulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Digite as medidas do trinagulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n",areaX);
		System.out.printf("Área do triangulo Y: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();


	}

}

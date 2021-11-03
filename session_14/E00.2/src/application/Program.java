package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> shape = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Enter the shape color (BLACK / WHITE / RED): ");
			Color color = Color.valueOf(sc.next());

			sc.nextLine();

			if (ch == 'r') {
				System.out.print("Enter the width and height: ");
				double width = sc.nextDouble();
				double height = sc.nextDouble();
				shape.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Enter the radius: ");
				double radius = sc.nextDouble();
				shape.add(new Circle(color, radius));
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape s : shape) {
			System.out.println(String.format("%.2f", s.area()));
		}
		sc.close();
	}
}

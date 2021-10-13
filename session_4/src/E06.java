import java.util.Scanner;

public class E06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double a = sc.nextDouble();
		System.out.print("Digite outro valor: ");
		double b = sc.nextDouble();
		System.out.print("Digite outro valor: ");
		double c = sc.nextDouble();
		
		double triangulo = a * c / 2.0;
		double circulo = 3.14159 * c * c;
		double trapezio = (a + b) / 2.0 * c;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.printf("%nTriangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);
		
		sc.close();
	}

}

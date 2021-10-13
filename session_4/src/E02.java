import java.util.Scanner;

public class E02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio: ");
		
		double a = sc.nextDouble();
		double b = 3.14159;
		
		double c = b*a*a;
		
		System.out.printf("A: %.4f", c);
		
		sc.close();
		
	}
}
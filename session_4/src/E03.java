import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int a = sc.nextInt();
		System.out.print("Digite outro n�mero: ");
		int b = sc.nextInt();
		System.out.print("Digite outro n�mero: ");
		int c = sc.nextInt();
		System.out.print("Digite outro n�mero: ");
		int d = sc.nextInt();
		int e = (a*b-c*d);
		
		System.out.println("Diferen�a: "+ e);
		
		sc.close();
		
	}

}

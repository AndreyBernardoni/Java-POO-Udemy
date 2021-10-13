import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		System.out.print("Digite outro número: ");
		int b = sc.nextInt();
		System.out.print("Digite outro número: ");
		int c = sc.nextInt();
		System.out.print("Digite outro número: ");
		int d = sc.nextInt();
		int e = (a*b-c*d);
		
		System.out.println("Diferença: "+ e);
		
		sc.close();
		
	}

}

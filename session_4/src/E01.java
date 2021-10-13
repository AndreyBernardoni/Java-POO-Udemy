import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número a ser somado: ");
		int a = sc.nextInt();
		System.out.print("Digite outro número a ser somado: ");
		int b = sc.nextInt();
			
		int c = a+b;
			
		System.out.println("Soma: " + c);
			
		sc.close();	
		
	}
}

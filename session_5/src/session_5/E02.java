package session_5;
import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		sc.close();
		
		if (x%2==0) {
			System.out.println("Este número é par!");
		}else {
			System.out.println("Este número é impar!");
		}
		
		
	}

}

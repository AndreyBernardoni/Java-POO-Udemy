package session_5;
import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int x = sc.nextInt();
		System.out.print("Digite outro n�mero: ");
		int y = sc.nextInt();
		sc.close();
		
		if (x%y==0 || y%x==0) {
			System.out.println("S�o multiplos!");
		}else {
			System.out.println("N�o s�o multiplos!");
		}

	}

}

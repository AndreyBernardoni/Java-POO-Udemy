package session_6;
import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		while (senha!=2002) {
			System.out.print("Senha Invalida, tente novamente! ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		sc.close();
	}

}

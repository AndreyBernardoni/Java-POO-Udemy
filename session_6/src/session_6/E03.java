package session_6;
import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.print("Digite o tipo de combustivel: ");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			switch (tipo) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel+= 1;
			default:
				break;
			}
			
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
	}

}

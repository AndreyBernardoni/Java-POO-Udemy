package session_5;
import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		 int x = sc.nextInt();
		 
		 sc.close();
		 
		 if (x<0) {
			System.out.println("Este valor é negativo!");
		}else {
			System.out.println("Este valor é positivo!");
		}

	}

}

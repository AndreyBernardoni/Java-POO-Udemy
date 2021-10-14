package session_5;
import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora inicial do jogo: ");
		int hi = sc.nextInt();
		System.out.print("Digite a hora final do jogo: ");
		int hf = sc.nextInt();
		sc.close();
		int total;
		
		if (hi<hf) {
			total = hf-hi;
		}else {
			total = 24 - hi+hf;
		}
		
		System.out.println("O jogo durou "+total+" hora(s)!");
	}

}

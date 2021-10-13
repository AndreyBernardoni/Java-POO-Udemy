import java.util.Scanner;

public class E05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código de uma peça: ");
		int id_p1 = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int qtde_p1 = sc.nextInt();
		System.out.print("Digite o valor da peça: ");
		double vl_p1 = sc.nextDouble();
		
		System.out.print("Digite o código de outra peça: ");
		int id_p2 = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int qtde_p2 = sc.nextInt();
		System.out.print("Digite o valor da peça: ");
		double vl_p2 = sc.nextDouble();
		
		double total = (vl_p1 * qtde_p1) + (vl_p2 * qtde_p2);
		
		System.out.printf("Valor a pagar : R$%.2f",total);
		
		sc.close();
		
		
		
		
	}

}
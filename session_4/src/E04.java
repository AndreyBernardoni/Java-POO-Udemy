import java.util.Scanner;

public class E04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionário: ");
		int number = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Digite o valor recebido por hora: ");
		double valor = sc.nextDouble();
		
		double salario = valor * horas;
		
		System.out.printf("Número do funcionário: %d%nSalário: U$%.2f", number,salario);
		
		sc.close();
		
	}

}

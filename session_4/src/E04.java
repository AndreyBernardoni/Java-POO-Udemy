import java.util.Scanner;

public class E04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero do funcion�rio: ");
		int number = sc.nextInt();
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Digite o valor recebido por hora: ");
		double valor = sc.nextDouble();
		
		double salario = valor * horas;
		
		System.out.printf("N�mero do funcion�rio: %d%nSal�rio: U$%.2f", number,salario);
		
		sc.close();
		
	}

}

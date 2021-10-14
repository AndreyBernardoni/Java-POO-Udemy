package session_5;
import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X: ");
		double x = sc.nextDouble();
		System.out.print("Digite a coordenada Y: ");
		double y = sc.nextDouble();
		sc.close();
		
		if (x>0) {
			
			if (y>0) {
				System.out.println("Q1");
			}else {
				System.out.println("Q4");	
			}
			
		}else if(x<0) {
			if (y>0) {
				System.out.println("Q2");
			}else {
				System.out.println("Q3");
			}
		}else {
			System.out.println("Origem");
		}
	}

}

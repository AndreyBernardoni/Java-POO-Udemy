package session_5;
import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o codigo do produto: ");
		int x = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		int y = sc.nextInt();
		sc.close();
		double t = 0;
		
		/*if (x==1) {
			t = y*4.0;
		}else if(x==2) {
			t = y*4.5;
		}else if(x==3) {
			t = y*5.0;
		}else if(x==4) {
			t = y*2.0;
		}else{
			t = y*1.5;*/
		
		
		switch (x) {
		case 1: {	
			t = y*4.0;
			break;
		}
		case 2:{
			t = y*4.5;
			break;
		}
		case 3:{
			t = y*5.0;
			break;
		}
		case 4:{
			t = y*2.0;
			break;
		}
		default:
			System.out.println("Valor invalido: "+x);
			break;
		}
		
		System.out.printf("Total: R$%.2f", t);
		
	}

}

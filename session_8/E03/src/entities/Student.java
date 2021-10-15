package entities;

public class Student {
	public String nome;
	public double n1, n2, n3;
	
	public double calcTotal() {
		return n1 + n2 + n3;
	}
	
	public double calcFalta() {
		if (calcTotal()<60) {
			return 60 - calcTotal();
		}else {
			return 0;
		}
	}
	
	
}

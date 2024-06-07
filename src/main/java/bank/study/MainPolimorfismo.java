package bank.study;

public class MainPolimorfismo {
	public static void main(String[] args) {
		Forma[] formas = new Forma[2];
		formas[0] = new Circulo(5);
		formas[1] = new Quadrado(1);
		
		for (Forma forma : formas) {
			System.out.println("Area da forma: " + forma.calcularArea());
	
		}
	}

}

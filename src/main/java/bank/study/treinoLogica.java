package bank.study;

import java.util.Scanner;

public class treinoLogica {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a quantidade que precisa:");
		double quantidade = leia.nextDouble();
		quantidade = quantidade * 1.5;
		for(int i = 0; i < quantidade;  i++) {
			System.out.println("Ola  mundo");
		}
		
	}


}

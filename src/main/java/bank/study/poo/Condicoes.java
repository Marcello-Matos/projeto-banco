package bank.study.poo;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valorDigitado = scan.nextInt();
		
		/*if(valorDigitado > 100) {
			System.out.println("Valor Maior do que 100");
		}else {
			System.out.println("Valor menor ou igual a 100");
		}*/
		//ternario
		System.out.println(valorDigitado > 100 ? "Valor Maior do que 100" : "Valor menor ou igual a 100");
		

	}

}

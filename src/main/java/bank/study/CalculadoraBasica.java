package bank.study;

import java.util.Scanner;

public class CalculadoraBasica {
	public static double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}
	public static double subtracao(double numero1, double numero2) {
		return numero1 - numero2;
	}
	public static double multiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}
	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
		
	}
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		while (true) {
			System.out.println("Informe o metodo a ser calculado / ou (SAIR)");
			String operador = entrada.next();
			if (operador.equalsIgnoreCase("sair")) {
				System.out.println("Fim da Operacao.");
				break;
			}
			System.out.println("Informe o primeiro numero:");
			double numero1 = entrada.nextDouble();
			System.out.println("Informe o segundo numero:");
			double numero2 = entrada.nextDouble();
				if (operador.equals("soma")) {
					System.out.println(soma(numero1, numero2));
				}else if (operador.equals("subtracao")) {
					System.out.println(subtracao(numero1, numero2));
				}else if (operador.equals("multiplicacao")) {
					System.out.println(multiplicacao(numero1, numero2));
				}else if (operador.equals("divisao")) {
					System.out.println(divisao(numero1, numero2));
				}else {
					System.out.print("Operador nao identificado");
					
				}
		}	
	}
	
}
	

